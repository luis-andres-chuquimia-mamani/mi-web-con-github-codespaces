package com.luis_andres.spring.web_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis_andres.spring.web_control.model.UserInfo;

public interface repositoryUser extends JpaRepository<UserInfo, Long> {
    
    UserInfo findByUsername(String username);
    
}
