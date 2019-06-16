package com.camaras.wiku.dao;

import com.camaras.wiku.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginDao extends JpaRepository <Login, Integer> {

    Login findByUsuarioAndPassword(String usuario, String password);

}
