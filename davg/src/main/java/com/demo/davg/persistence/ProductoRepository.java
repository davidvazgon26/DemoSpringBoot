package com.demo.davg.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demo.davg.persistence.crud.ProductoCrudRepository;
import com.demo.davg.persistence.entity.Producto;

@Repository // Esta notacion le indica a Spring boot que esta clase interactua con la BD
public class ProductoRepository { // Repository es la que interactua directamente con la BD.
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll(); // Puedo castear el tipo de lista
    }

    public List<Producto> getByProductos(int idCategoria) {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessTHanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    @SuppressWarnings("null")
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }
}
