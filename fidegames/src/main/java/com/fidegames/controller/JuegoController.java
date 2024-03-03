
package com.fidegames.controller;

import com.fidegames.service.JuegoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/juego")
public class JuegoController {
    @Autowired
    private JuegoService juegoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var juegos = juegoService.getJuegos();
        model.addAttribute("juegos", juegos);
        return "juego/listado";
    }
}
