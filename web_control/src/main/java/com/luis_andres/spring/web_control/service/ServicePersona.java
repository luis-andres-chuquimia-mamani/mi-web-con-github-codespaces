package com.luis_andres.spring.web_control.service;

import java.util.List;

import com.luis_andres.spring.web_control.model.Persona;

public interface ServicePersona {

    List<Persona> listarPersonas();
    Persona encontrarPorId(int id);
    void reguistrarPersona(Persona p);
    void eliminarPersona(int id);
    
}
