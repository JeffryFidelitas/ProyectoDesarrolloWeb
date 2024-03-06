package com.ProyectoFinal.ProyectoFinal.controller;

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
@RequestMapping("/")
public class controller {

    @Autowired
    private gameService gameService;
    
    @GetMapping("/games")
    public String games(Model model) {
        var games = gameService.getGames();
        model.addAttribute("games", games);
        return "/games";
    }
    
    @GetMapping("/games/{id}")
    public String play(Model model, @PathVariable("id") String id) {
        var game = gameService.getGame(Long.parseLong(id));
        if (game == null) return "/404";
        model.addAttribute("game", game);
        return "/play";
    }
    
    @GetMapping("/about")
    public String about(){
        return "/about";
    }
    
    @GetMapping("/news")
    public String noticias(){
        return "/news";
    }
    
    @GetMapping("/contact")
    public String contacto(){
        return "/contact";
    }
}