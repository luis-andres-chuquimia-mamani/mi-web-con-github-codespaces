package com.luis_andres.spring.web_control.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis_andres.spring.web_control.model.Mascota;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/mascota")
public class ControllerMascota {


    
    @GetMapping("/encontrarMascota/{id}")
    public Mascota encontrarMascota(@PathVariable Long id){
        return new Mascota(1L, "Perro", "12345");
    }

    @PostMapping("/reguistrarMascota")
    public Mascota reguistrarMascota(@RequestBody Mascota m) { 
        return new Mascota(m.getId(), m.getAnimal(), m.getNumeroCollar());
    }
    
    

    
    
}
