package com.example.gestionproductos.service;

import com.example.gestionproductos.model.Producto;
import com.example.gestionproductos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getLibros(){
        return productoRepository.listarProductos();
    }

    public Producto saveProducto(Producto prod){
        return productoRepository.agregarProducto(prod);
    }

    public Boolean deleteProducto(String name){
        return productoRepository.eliminarProducto(name);
    }

}
