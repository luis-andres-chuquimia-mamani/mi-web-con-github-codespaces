package com.luis_andres.spring.web_control.repository;

import org.springframework.stereotype.Repository;

import com.luis_andres.spring.web_control.model.ObjetoLibro;

@Repository
public class repositoryHolaMundoImplements implements repositoryHolaMundo{

    @Override
    public ObjetoLibro encontrarLibroBBD(int id) {
        return new ObjetoLibro(1,"Mi Trucha");
    }

}