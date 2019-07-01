package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.CiudadDao;
import com.camaras.wiku.model.Ciudad;
import com.camaras.wiku.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {
    @Autowired
    CiudadDao ciudadDao;
    @Override
    public List<String> getAllCiudadesForAutocomplete() {
        return ciudadDao.findAllCiudadesName();
    }
}
