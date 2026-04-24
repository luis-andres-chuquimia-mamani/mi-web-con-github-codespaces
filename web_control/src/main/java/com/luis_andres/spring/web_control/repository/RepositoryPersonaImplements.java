package com.luis_andres.spring.web_control.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.luis_andres.spring.web_control.model.Persona;

@Repository
public class RepositoryPersonaImplements implements RepositoryPersona{


    private List<Persona> ListaBDD = new ArrayList<>(
        List.of(
            new Persona(89,"Joselu","Santa Cruz"),
            new Persona(707,"CR7","Portugal"),
            new Persona(203,"Messi","Rosario")
        )
    );

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
    public Persona reguistrarPersona(Persona p) {
        System.out.println("Metodo -> reguistrarPersona");
        this.ListaBDD.add(p);
        return p;
    }

    @Override
    public Persona actualizarPersonaRepositorio(int id, Persona p) {
        System.out.println("Metodo -> actualizarPersonaRepositorio");
        Persona personaCambio = new Persona();
        for (Persona persona : ListaBDD) {
            if(persona.getId() == id){
                persona = p;
                personaCambio = persona;
            }
        }
        return personaCambio;
    }

    @Override
    public void eliminarPersona(int id) {
        System.out.println("Metodo -> eliminarPersona");
        this.ListaBDD = this.ListaBDD.stream()
            .filter(p -> p.getId() != id)
            .toList();
    }


    
}
