package com.luis_andres.spring.web_control.service;

import java.util.List;

import com.luis_andres.spring.web_control.model.Persona;

public interface ServicePersona {

    List<Persona> listarPersonas();
    Persona encontrarPorId(int id);
    Persona reguistrarPersona(Persona p);
    Persona actualizarPersonaServicio(int id, Persona p);
    void eliminarPersona(int id);
    
}
