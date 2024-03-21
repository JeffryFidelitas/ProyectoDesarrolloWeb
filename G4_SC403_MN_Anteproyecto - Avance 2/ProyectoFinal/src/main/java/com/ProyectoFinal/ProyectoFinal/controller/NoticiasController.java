package com.ProyectoFinal.ProyectoFinal.controller;

import com.ProyectoFinal.ProyectoFinal.domain.Noticia;
import com.ProyectoFinal.ProyectoFinal.service.NoticiaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.ProyectoFinal.ProyectoFinal.service.gameService;

@Controller
@Slf4j
@RequestMapping("/noticia")
public class NoticiasController {

    @Autowired
    private NoticiaService noticiaService;
    
   @GetMapping("/newslist")
    public String inicio(Model model) {
        var noticias = noticiaService.getNoticias();
        model.addAttribute("Noticias", noticias);
        return "/noticia/newslist";
    }
    
    @GetMapping("/listado")
    public String inicio2(Model model) {
        var noticias = noticiaService.getNoticias();
        model.addAttribute("Noticias", noticias);
        return "/noticia/listado";
    }
    
    @GetMapping("/eliminar/{id}")
    public String notiEliminar(Noticia noticia) {
        noticiaService.delete(noticia);
        return "redirect:/noticia/listado";
    }

    @GetMapping("/modificar/{id}")
    public String notiModificar(Noticia noticia, Model model) {
        noticia = noticiaService.getNoticia(noticia);
        model.addAttribute("Noticia", noticia);
        return "/noticia/mods";
    }
}