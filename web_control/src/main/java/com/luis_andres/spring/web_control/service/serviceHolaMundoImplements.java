package com.luis_andres.spring.web_control.service;
import org.springframework.stereotype.Service;

import com.luis_andres.spring.web_control.model.ObjetoLibro;

@Service
public class serviceHolaMundoImplements implements serviceHolaMundo{

    @Override
    public ObjetoLibro encontrarLibro(int id){
        ObjetoLibro libro = new ObjetoLibro(1,"Mi Lucha");
        if(id == 1){
            return libro;
        }else{
            return new ObjetoLibro(999,"El libro no existe");
        }
    }

}
