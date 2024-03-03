/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package libreria.demo.service.impl;

import libreria.demo.domain.libro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import libreria.demo.dao.LibroDao;
import libreria.demo.service.libroService;
@Service
public class LibroServiceImpl implements libroService {
    @Autowired
    private LibroDao libroDao;
    
    
    @Transactional(readOnly=true)
    @Override
    public List<libro> getLibros() {
        var lista=libroDao.findAll();
        return lista;
    }
}
