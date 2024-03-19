package com.ProyectoFinal.ProyectoFinal.service;

import com.ProyectoFinal.ProyectoFinal.domain.Noticia;
import java.util.List;

public interface NoticiaService {
    // Se obtiene un listado de libros en un List
    public List<Noticia> getNoticias();
    public Noticia getNoticia(long id);
}