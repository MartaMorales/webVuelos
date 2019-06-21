package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.PaisDao;
import com.camaras.wiku.model.Pais;
import com.camaras.wiku.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {
    @Autowired
    PaisDao paisDao;

    @Override
    public List<String> getAllNamePaises() {
        return paisDao.findAllPaisesName();
    }

    @Override
    public List<Pais> getAllPaises() {
        return paisDao.findAll();
    }
}
