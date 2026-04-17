package com.luis_andres.spring.web_control.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

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
            .ciudad("Beni")
            .build();

        when(repo.encontrarPorId(1)).thenReturn(p0);
    }

    @Test
    public void encontrarPorIdTest(){
        int idPersona = 1;
        Persona p = repo.encontrarPorId(idPersona);
        assertEquals(idPersona, p.getId());
        System.out.println("Persona :"+p);
    }







    
}
