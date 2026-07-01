package com.luis_andres.spring.web_control.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.luis_andres.spring.web_control.model.UserInfo;
import com.luis_andres.spring.web_control.repository.repositoryUser;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ServiceUserInfoImp implements UserDetailsService {

    private final repositoryUser repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        UserInfo userInfo = repo.findByUsername(username);
        return User.builder()
            .username(userInfo.getUsername())
            .password(userInfo.getPassword())
            .roles(userInfo.getRoles())
            .build(); 
            
    }

    
}
