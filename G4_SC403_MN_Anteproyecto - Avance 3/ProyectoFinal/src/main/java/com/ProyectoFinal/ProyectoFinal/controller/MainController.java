package com.ProyectoFinal.ProyectoFinal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class MainController {
    @GetMapping("/about")
    public String about(){
        return "/about";
    }
}