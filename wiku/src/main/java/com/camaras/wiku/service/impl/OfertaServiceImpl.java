package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.OfertaDao;
import com.camaras.wiku.model.Oferta;
import com.camaras.wiku.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfertaServiceImpl implements OfertaService {

    @Autowired
    OfertaDao ofertaDao;

    @Override
    public List<Oferta> getOfertasForCarousel(){
        return ofertaDao.findAll();
    }
}
