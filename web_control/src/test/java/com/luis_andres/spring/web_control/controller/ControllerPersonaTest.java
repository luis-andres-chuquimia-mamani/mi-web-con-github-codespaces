package com.luis_andres.spring.web_control.controller;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.luis_andres.spring.web_control.model.Persona;
import com.luis_andres.spring.web_control.service.ServicePersona;

@WebMvcTest(ControllerPersona.class)
public class ControllerPersonaTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ServicePersona servicio;

    private Persona persona1;

    @BeforeEach
    void setUp(){
        persona1 = Persona.builder()
            .id(1)
            .nombre("Andres")
            .ciudad("Beni")
            .build();
            
        Persona persona2 = Persona.builder()
            .id(1)
            .nombre("Andres")
            .ciudad("Beni")
            .build();
    }

    public void reguistrarPersonaTest(){
        Persona persona = Persona.builder()
        .id(9090)
        .nombre("nil ")
        .ciudad("Beni")
        .build();


    }


    

}
