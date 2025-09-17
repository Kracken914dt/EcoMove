package com.EcoMove.dto;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private String token;
    private String userId;
    private String nombre;
    private String correo;
}