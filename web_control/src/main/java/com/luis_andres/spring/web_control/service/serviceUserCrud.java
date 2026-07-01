package com.luis_andres.spring.web_control.service;

import java.util.List;

import com.luis_andres.spring.web_control.model.UserInfo;

public interface serviceUserCrud {
     
    UserInfo crearUsuario(UserInfo userInfo);
    List<UserInfo> listarUsuarios();
    
}
