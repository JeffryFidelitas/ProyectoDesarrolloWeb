package com.ProyectoFinal.ProyectoFinal.service;

import com.ProyectoFinal.ProyectoFinal.domain.Contacto;
import java.util.List;

public interface ContactoService {
    // Se obtiene un listado de libros en un List
    public List<Contacto> getContactos();
    public Contacto getContacto(long id);
}
