package com.luis_andres.spring.web_control.service;
import org.springframework.stereotype.Service;

import com.luis_andres.spring.web_control.model.ObjetoLibro;
import com.luis_andres.spring.web_control.repository.repositoryHolaMundo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class serviceHolaMundoImplements implements serviceHolaMundo{

    private final repositoryHolaMundo repository;
    
    @Override
    public ObjetoLibro encontrarLibro(int id){
        if(id == 1){
            return repository.encontrarLibroBBD(id);
        }else{
            return new ObjetoLibro(999,"El libro no existe");
        }
    }

}
