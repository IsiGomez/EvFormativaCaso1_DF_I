package com.example.gestionproductos.controller;

import com.example.gestionproductos.model.Producto;
import com.example.gestionproductos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> mostrarProductos(){
        return productoService.getLibros();
    }

    @PostMapping
    public ResponseEntity<String> agregarProducto(@Validated @RequestBody Producto prod){
        productoService.saveProducto(prod);
        return ResponseEntity.status(HttpStatus.OK).body("Producto recibido y agregado: " + prod.getNombre());
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<String> eliminarProducto(@PathVariable String name){
        boolean verificacion = productoService.deleteProducto(name);
        if (verificacion){
            return ResponseEntity.status(HttpStatus.OK).body("Producto borrado correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: El producto: " + name + " no existe.");
        }
    }

}
