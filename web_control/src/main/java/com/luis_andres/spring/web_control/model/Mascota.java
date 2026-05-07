package com.luis_andres.spring.web_control.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Mascota {
    private Long id;
    private String animal;
    private String numeroCollar;

}
