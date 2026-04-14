package com.luis_andres.spring.web_control.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis_andres.spring.web_control.model.Persona;



@RestController
@RequestMapping("/persona")
public class ControllerPersona {


    @GetMapping("/{id}")
    public Persona personaPorId(@PathVariable String id) {
        return new Persona();
    }
    
}
