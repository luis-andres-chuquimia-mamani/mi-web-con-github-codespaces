package com.luis_andres.spring.web_control.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luis_andres.spring.web_control.model.Persona;
import com.luis_andres.spring.web_control.repository.RepositoryPersona;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicePersonaImplements implements ServicePersona{

    private final RepositoryPersona repo;

    @Override
    public List<Persona> listarPersonas() {
        return repo.listarPersonas();
    }

    @Override
    public Persona encontrarPorId(int id) {
        return repo.encontrarPorId(id);
    }

    @Override
    public Persona reguistrarPersona(Persona p) {
        return repo.reguistrarPersona(p);
    }

    @Override
    public Persona actualizarPersonaServicio(int id, Persona p){
        return repo.actualizarPersonaRepositorio(id,p);
    }

    @Override
    public void eliminarPersona(int id) {
        repo.eliminarPersona(id);
    }
    
}
