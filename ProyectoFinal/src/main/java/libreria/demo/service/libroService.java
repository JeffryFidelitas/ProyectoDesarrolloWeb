/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.demo.service;

import libreria.demo.domain.libro;
import java.util.List;

public interface libroService {
    // Se obtiene un listado de libros en un List
    public List<libro> getLibros();
}
