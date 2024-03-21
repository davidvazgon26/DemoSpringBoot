package com.demo.davg.persistence;

import java.util.List;

import com.demo.davg.persistence.crud.ProductoCrudRepository;
import com.demo.davg.persistence.entity.Producto;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll(); // Puedo castear el tipo de lista
    }

    public List<Producto> getByProductos(int idCategoria) {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }
}
