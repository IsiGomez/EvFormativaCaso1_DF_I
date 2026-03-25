package com.example.gestionproductos.repository;

import com.example.gestionproductos.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {

    private List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> listarProductos(){
        return listaProductos;
    }

    public void agregarProducto(Producto prod){
        listaProductos.add(prod);;
    }

    public Boolean eliminarProducto(String nombre){
        for (Producto p : listaProductos){
            if (p.getNombre().equals(nombre)){
                listaProductos.remove(p);
                return true;
            }
        }
        return false;
    }

}
