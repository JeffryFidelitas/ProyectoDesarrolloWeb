package com.ProyectoFinal.ProyectoFinal.controller;

import com.ProyectoFinal.ProyectoFinal.service.ContactoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@Slf4j
@RequestMapping("/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;
    
   @GetMapping("/contactlist")
    public String inicio(Model model) {
        var contactos = contactoService.getContactos();
        model.addAttribute("Contactos", contactos);
        return "/contacto/contactlist";
    }
    
    
}
