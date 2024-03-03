/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidegames.service.impl;

import com.fidegames.dao.JuegoDao;
import com.fidegames.domain.Juego;
import com.fidegames.service.JuegoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class JuegoServiceImpl implements JuegoService{
    @Autowired
    private JuegoDao juegoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Juego> getJuegos() {
        var lista=juegoDao.findAll();
        return lista;
    }
}
