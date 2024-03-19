package com.ProyectoFinal.ProyectoFinal.service.impl;

import com.ProyectoFinal.ProyectoFinal.dao.ContactoDao;
import com.ProyectoFinal.ProyectoFinal.domain.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ProyectoFinal.ProyectoFinal.domain.Noticia;
import com.ProyectoFinal.ProyectoFinal.service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService {
    @Autowired
    private ContactoDao contactoDao;
    
    
    @Transactional(readOnly=true)

    @Override
    public List<Contacto> getContactos() {
        var lista=contactoDao.findAll();
        return lista;
    }

    @Override
    public Contacto getContacto(long id) {
        var noticia=contactoDao.findById(id).orElse(null);
        return noticia;
    }
}
