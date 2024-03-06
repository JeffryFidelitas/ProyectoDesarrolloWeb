package com.ProyectoFinal.ProyectoFinal.service;

import com.ProyectoFinal.ProyectoFinal.domain.game;
import java.util.List;

public interface gameService {
    // Se obtiene un listado de libros en un List
    public List<game> getGames();
    public game getGame(long id);
}
