package com.luis_andres.spring.web_control.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.luis_andres.spring.web_control.model.UserInfo;
import com.luis_andres.spring.web_control.repository.repositoryUser;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class serviceUserCrudImp implements serviceUserCrud {

    private final repositoryUser repo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserInfo crearUsuario(UserInfo userInfo) {
        String encodedPassword = passwordEncoder.encode(userInfo.getPassword());
        userInfo.setPassword(encodedPassword);
        repo.save(userInfo);
        return userInfo;
    }


    @Override
    public List<UserInfo> listarUsuarios() {
        return repo.findAll();
    }

    

    
}
