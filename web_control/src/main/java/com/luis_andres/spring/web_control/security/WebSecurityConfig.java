package com.luis_andres.spring.web_control.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final UserDetailsService service;
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        return http
            .csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests( req -> req
                .requestMatchers("/registro/**")
                .permitAll()
                .anyRequest()
                .authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .userDetailsService(service)
            .build();
            //.userDetailsService(service) agregar para usar la BDD
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    /*
    @Bean
    public UserDetailsService Users(){
        UserDetails user = User.builder()
            .username("luis")
            .password("{noop}0123")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(user);
    }
        */
    
    

    
}
