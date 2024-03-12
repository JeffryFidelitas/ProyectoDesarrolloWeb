package com.ProyectoFinal.ProyectoFinal.dao;

import com.ProyectoFinal.ProyectoFinal.domain.game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface gameDao extends JpaRepository <game,Long>{
    
}

