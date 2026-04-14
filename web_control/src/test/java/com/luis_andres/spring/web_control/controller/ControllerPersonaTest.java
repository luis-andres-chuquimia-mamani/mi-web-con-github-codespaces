package com.luis_andres.spring.web_control.controller;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.luis_andres.spring.web_control.model.Persona;

@WebMvcTest(ControllerPersona.class)
public class ControllerPersonaTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp(){
        Persona persona = Persona.builder()
            .id(1)
            .nombre("Andres")
            .ciudad("Beni")
            .build();
    }

}
