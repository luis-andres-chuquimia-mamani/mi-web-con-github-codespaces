package com.luis_andres.spring.web_control.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.luis_andres.spring.web_control.model.Persona;

@Repository
public class RepositoryPersonaImplements implements RepositoryPersona{

    private List<Persona> ListaBDD = new ArrayList<>(List.of(
        new Persona (1,"Luis","LA PAZ"),
        new Persona (2,"Andres","SANTA CRUZ"),
        new Persona (3,"Victor","BENI")
    ));

    @Override
    public List<Persona> listarPersonas() {
        System.out.println("Metodo -> listarPersonas");
        return this.ListaBDD;
    }

    @Override
    public Persona encontrarPorId(int id) {
        System.out.println("Metodo -> encontrarPorId");
        return this.ListaBDD.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElseThrow();
    }

    @Override
    public void reguistrarPersona(Persona p) {
        System.out.println("Metodo -> reguistrarPersona");
        this.ListaBDD.add(p);
    }

    @Override
    public void eliminarPersona(int id) {
        System.out.println("Metodo -> eliminarPersona");
        this.ListaBDD = this.ListaBDD.stream()
            .filter(p -> p.getId() != id)
            .toList();
    }
    
}
