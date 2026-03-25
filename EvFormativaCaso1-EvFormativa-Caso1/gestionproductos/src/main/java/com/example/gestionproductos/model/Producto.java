package com.example.gestionproductos.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @NotBlank
    private String nombre;
    @NotNull
    private int precio;
    @NotBlank
    private String categoria;

}
