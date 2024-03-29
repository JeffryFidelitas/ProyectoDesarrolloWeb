package com.ProyectoFinal.ProyectoFinal.dao;

import com.ProyectoFinal.ProyectoFinal.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDao extends JpaRepository <Game,Long>{
    
}

