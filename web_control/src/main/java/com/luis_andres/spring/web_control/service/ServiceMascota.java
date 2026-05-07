package com.luis_andres.spring.web_control.service;

import java.util.List;

import com.luis_andres.spring.web_control.model.Mascota;

public interface ServiceMascota {

    List<Mascota> listarMascotasService();
    Mascota encontrarMascotaService(Long id);

    Mascota crearMascotaService(Mascota mascota);
    Mascota actualizarMascotaService(Long id, Mascota mascota);
    void eliminarMascotaService(Long id);

    
    
}
