package com.luis_andres.spring.web_control.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.luis_andres.spring.web_control.model.Persona;
import com.luis_andres.spring.web_control.repository.RepositoryPersona;


@SpringBootTest
public class ServicePersonaTest {

    @Autowired
    ServicePersona service;

    @MockitoBean
    RepositoryPersona repo;

    @BeforeEach
    void setUp(){
        Persona persona1 = Persona.builder()
        .id(10)
        .nombre("Lionel")
        .ciudad("Oruro")
        .build();

        Persona persona2 = Persona.builder()
        .id(22)
        .nombre("Maria")
        .ciudad("Buenos Aires")
        .build();

        List<Persona> listaPersonas = new ArrayList<>(List.of(persona1,persona2));
        when(this.repo.encontrarPorId(10)).thenReturn(persona1);
        when(this.repo.listarPersonas()).thenReturn(listaPersonas);
    }

    @Test
    public void encontrarPorIdTest(){
        int id = 10;
        Persona personaTest = repo.encontrarPorId(id);
        assertEquals(id,personaTest.getId());
        verify(this.repo).encontrarPorId(id);
    }

    @Test
    public void listarPersonasTest(){
        List<Persona> listaTest =  repo.listarPersonas();
        assertNotNull(listaTest);
        verify(this.repo).listarPersonas();
    }

    @Test
    public void reguistrarPersonaTest(){
        Persona persona = Persona.builder()
        .id(1010)
        .nombre("Facundo")
        .ciudad("Beni")
        .build();
        this.repo.reguistrarPersona(persona);
        verify(this.repo).reguistrarPersona(persona);
    }
    
    @Test
    public void eliminarPersona(){
        int idEliminar = 322;
        this.repo.eliminarPersona(idEliminar);
        verify(this.repo).eliminarPersona(idEliminar);
    }

}
