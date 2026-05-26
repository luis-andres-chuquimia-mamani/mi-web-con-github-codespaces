package com.luis_andres.spring.web_control.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis_andres.spring.web_control.model.Mascota;
import com.luis_andres.spring.web_control.service.ServiceMascota;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/mascota")
@RequiredArgsConstructor
public class ControllerMascota {

    private final ServiceMascota serviceMascota;

    @GetMapping("/listarMascotas")
    public List<Mascota> listarMascotas() {
        return serviceMascota.listarMascotasService();
    }
    
    
    @GetMapping("/encontrarMascota/{id}")
    public Mascota encontrarMascota(@PathVariable Long id){
        return serviceMascota.encontrarMascotaService(id);
    }

    @PostMapping("/reguistrarMascota")
    public Mascota reguistrarMascota(@RequestBody Mascota m) { 
        return serviceMascota.crearMascotaService(m);
    }

    @PutMapping("/actualizarMascota/{id}")
    public Mascota actualizarMascota(@PathVariable Long id, @RequestBody Mascota mascota) {
        return serviceMascota.actualizarMascotaService(id, mascota);
    }

    @DeleteMapping("/eliminarMascota/{id}")
    public String eliminarMascota(@PathVariable Long id) {
        serviceMascota.eliminarMascotaService(id); 
        return "Mascota eliminada con exito";
    }
    
    

    
    
}
