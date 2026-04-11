package com.luis_andres.spring.web_control.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.luis_andres.spring.web_control.model.ObjetoLibro;
import com.luis_andres.spring.web_control.service.serviceHolaMundo;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/endpoind")
@RequiredArgsConstructor
public class HolaMundo {
    
    private final serviceHolaMundo servicio;


    @GetMapping("/libro")
    public ObjetoLibro inicio(){
        return servicio.encontrarLibro(1);
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo :D";
    }
    

    
}