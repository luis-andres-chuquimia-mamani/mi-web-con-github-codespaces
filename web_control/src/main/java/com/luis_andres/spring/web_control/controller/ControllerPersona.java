package com.luis_andres.spring.web_control.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis_andres.spring.web_control.model.Persona;
import com.luis_andres.spring.web_control.service.ServicePersona;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class ControllerPersona {

    private final ServicePersona servicio;

    @GetMapping("/lista")
    public List<Persona> listarPersonas() {
        return servicio.listarPersonas();
    }

    @GetMapping("/buscar/{id}")
    public Persona personaPorId(@PathVariable int id) {
        return servicio.encontrarPorId(id);
    }

    @PostMapping("/reguistrar")
    public Persona reguistrarPersona(@RequestParam Persona p) {
        return this.servicio.reguistrarPersona( p);
    }

    @PutMapping("/actualizar/{id}")
    public Persona actualizarPersonaController(int id,@RequestBody Persona p) {
        return this.servicio.actualizarPersonaServicio(id, p);
    }
    

    @DeleteMapping("/eliminar/{id}")
    public String  eliminarPersona(@PathVariable int id) {
        this.servicio.eliminarPersona(id);
        return "Se elimino la persona";
    }
    
    
    
    
}
