package com.luis_andres.spring.web_control.repository;

import java.util.List;

import com.luis_andres.spring.web_control.model.Persona;

public interface RepositoryPersona {

    List<Persona> listarPersonas();
    Persona encontrarPorId(int id);
    Persona reguistrarPersona(Persona p);
    Persona actualizarPersonaRepositorio(int id, Persona p);
    void eliminarPersona(int id);
    
}
