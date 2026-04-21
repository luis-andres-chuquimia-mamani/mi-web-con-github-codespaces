package com.luis_andres.spring.web_control.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
public class ServicePersonaImplementsTest {

    @Autowired
    ServicePersona service;

    @MockitoBean
    RepositoryPersona repo;

    @BeforeEach
    void setUp(){

        Persona p0 = Persona.builder()
            .id(1)
            .nombre("Jose")
            .ciudad("Pando")
            .build();
        Persona p1 = Persona.builder()
            .id(2)
            .nombre("lusi")
            .ciudad("Santa Cruz")
            .build();

        List<Persona> listaTest = new ArrayList<>(List.of(p0,p1));

        when(repo.encontrarPorId(1)).thenReturn(p0);
        when(repo.listarPersonas()).thenReturn(listaTest);
    }

    @Test
    public void listarPersonasTest(){
        List<Persona> listaDePersonas = service.listarPersonas();
        assertNotNull(listaDePersonas);
    }

    @Test
    public void encontrarPorIdTest(){
        int idPersona = 1;
        Persona p = service.encontrarPorId(idPersona);
        assertEquals(idPersona, p.getId());
    }

    @Test
    public void reguistrarPersonaTest(){
        Persona p = new Persona(1,"Andres","Juarez");
        this.service.reguistrarPersona(p);
        verify(this.repo).reguistrarPersona(p);
    }

    @Test
    public void eliminarPersonaTest(){
        int id = 1;
        this.service.eliminarPersona(id);
        verify(this.repo).eliminarPersona(id);
    }










    
}
