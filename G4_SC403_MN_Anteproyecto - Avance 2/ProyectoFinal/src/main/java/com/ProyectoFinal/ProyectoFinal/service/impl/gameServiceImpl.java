package com.ProyectoFinal.ProyectoFinal.service.impl;

import com.ProyectoFinal.ProyectoFinal.domain.game;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ProyectoFinal.ProyectoFinal.dao.gameDao;
import com.ProyectoFinal.ProyectoFinal.service.gameService;
@Service
public class gameServiceImpl implements gameService {
    @Autowired
    private gameDao gameDao;
    
    
    @Transactional(readOnly=true)
    @Override
    public List<game> getGames() {
        var lista=gameDao.findAll();
        return lista;
    }
    
    @Transactional(readOnly=true)
    @Override
    public game getGame(long id) {
        var game=gameDao.findById(id).orElse(null);
        return game;
    }
}
