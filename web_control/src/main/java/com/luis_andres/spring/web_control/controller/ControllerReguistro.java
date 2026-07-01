package com.luis_andres.spring.web_control.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis_andres.spring.web_control.model.UserInfo;
import com.luis_andres.spring.web_control.service.serviceUserCrud;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/registro")
@RequiredArgsConstructor
@Slf4j
public class ControllerReguistro {

    public final serviceUserCrud service;

    
    @GetMapping("/listaRegistro")
    public List<UserInfo> listarRegistros(){
        return service.listarUsuarios();
    }

    @PostMapping("/userRegistro")
    public UserInfo registrarUsuario(@RequestBody UserInfo user){
        return service.crearUsuario(user);
    }

    @PostMapping("/testUser")
    public ResponseEntity<UserInfo> testUser(@RequestBody UserInfo user) {
    log.info("TestUser recibido: {}", user);
    return ResponseEntity.ok(user);
}
    
    
}
