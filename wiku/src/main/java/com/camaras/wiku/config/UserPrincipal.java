package com.camaras.wiku.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class UserPrincipal extends org.springframework.security.core.userdetails.User {

    private Integer id;

    public UserPrincipal(Integer id, String username, String password, boolean accountNonExpired,
                         boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled,
                         Collection<? extends GrantedAuthority> authorities) {
        super(username,password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;

    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPrincipal that = (UserPrincipal) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

private static List<? extends GrantedAuthority> getGrantedAuthorities(ArrayList<LinkedHashMap> authorities) {
    List<? extends GrantedAuthority> grantedAuthorities = null;
    if (!CollectionUtils.isEmpty(authorities)) {
        grantedAuthorities = authorities.stream()
                .map(authority ->
                        (GrantedAuthority) () ->
                                (String) authority.get("authority"))
                .collect(Collectors.toList());
    }
    return grantedAuthorities;
}
}
