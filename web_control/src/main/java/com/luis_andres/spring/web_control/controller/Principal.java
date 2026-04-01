package com.luis_andres.spring.web_control.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Principal {

    @GetMapping("/")
    public String paginaPrincipal(){
        return "Esta es la pagina Principal D: ";
    }

    
}