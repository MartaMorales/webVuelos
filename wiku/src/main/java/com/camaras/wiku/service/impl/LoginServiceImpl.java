package com.camaras.wiku.service.impl;

import com.camaras.wiku.config.UserPrincipal;
import com.camaras.wiku.dao.LoginDao;
import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.model.Login;
import com.camaras.wiku.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;

    @Override
    public Login getLoginFromForm(BuscarLoginDTO loginDTO) {
        return loginDao.findByUsuarioAndPassword(loginDTO.getUsuario(),loginDTO.getPassword());
    }

    @Transactional(readOnly=true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Login user = findUserByUsername(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(user != null) {
            authorities = buildUserAuthority();
        } else {
            user = new Login();
        }
        return buildUserForAuthentication(user, authorities);
    }

    // Converts User to org.springframework.security.core.userdetails.User
    private UserPrincipal buildUserForAuthentication(Login user, List<GrantedAuthority> authorities) {
        return new UserPrincipal( user.getId(),
                user.getUsuario(), user.getPassword(), true, true, true, true, authorities);
    }


    // Build the user authorities
    private List<GrantedAuthority> buildUserAuthority() {
        Set<GrantedAuthority> setAuths = new HashSet<>();

        setAuths.add(new SimpleGrantedAuthority("USER"));


        List<GrantedAuthority> Result = new ArrayList<>(setAuths);
        return Result;
    }

    @Transactional
    @Override
    public Login findUserByUsername(String username){
        return loginDao.findByUsuario(username);
    }
}
