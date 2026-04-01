package com.luis_andres.spring.web_control.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/endpoind")
public class HolaMundo {
    
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo :D";
    }
    

    
}