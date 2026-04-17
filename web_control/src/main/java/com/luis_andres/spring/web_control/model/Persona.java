package com.luis_andres.spring.web_control.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Persona {
    
    private int id;
    private String nombre;
    private String ciudad;

}
