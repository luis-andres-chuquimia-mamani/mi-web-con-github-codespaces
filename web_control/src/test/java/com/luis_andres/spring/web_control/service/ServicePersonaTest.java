package com.luis_andres.spring.web_control.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
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

        Persona persona3 = Persona.builder()
        .id(1010)
        .nombre("Facundo")
        .ciudad("Beni")
        .build();

        Persona persona4 = Persona.builder()
        .id(999)
        .nombre("Maravilla")
        .ciudad("Plata")
        .build();

        List<Persona> listaPersonas = new ArrayList<>(List.of(persona1,persona2,persona3));
        when(this.repo.encontrarPorId(10)).thenReturn(persona1);
        when(this.repo.listarPersonas()).thenReturn(listaPersonas);
        when(this.repo.reguistrarPersona(persona3)).thenReturn(persona3);
        when(this.repo.actualizarPersonaRepositorio(1010, persona4)).thenReturn(persona4);
    }

    @Test
    public void encontrarPorIdTest(){
        int id = 10;
        Persona personaTest = service.encontrarPorId(id);
        assertEquals(id,personaTest.getId());
        verify(this.repo).encontrarPorId(id);
    }

    @Test
    public void listarPersonasTest(){
        List<Persona> listaTest =  service.listarPersonas();
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
        Persona p = this.service.reguistrarPersona(persona);
        assertEquals(persona.getId(), p.getId());
        verify(this.repo).reguistrarPersona(persona);
    }

    @Test
    public void actualizarPersonaRepositorioTest(){
        Persona persona = Persona.builder()
        .id(999)
        .nombre("Maravilla")
        .ciudad("Plata")
        .build();
        Persona p = service.actualizarPersonaServicio(999, persona);
        assertEquals(persona.getNombre(), p.getNombre());
        verify(this.repo).actualizarPersonaRepositorio(999, persona);
    }


    @Test
    public void eliminarPersonaTest(){
        int idEliminar = 322;
        this.repo.eliminarPersona(idEliminar);
        verify(this.repo).eliminarPersona(idEliminar);
    }

}
