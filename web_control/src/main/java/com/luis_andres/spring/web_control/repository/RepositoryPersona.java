package com.luis_andres.spring.web_control.repository;

import java.util.List;

import com.luis_andres.spring.web_control.model.Persona;

public interface RepositoryPersona {

    List<Persona> listarPersonas();
    Persona encontrarPorId(int id);
    void reguistrarPersona(Persona p);
    void eliminarPersona(int id);
    
}
