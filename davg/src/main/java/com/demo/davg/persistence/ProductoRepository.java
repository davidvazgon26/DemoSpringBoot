package com.demo.davg.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demo.davg.domain.Product;
import com.demo.davg.domain.repository.ProductRepository;
import com.demo.davg.persistence.crud.ProductoCrudRepository;
import com.demo.davg.persistence.entity.Producto;
import com.demo.davg.persistence.mapper.ProductMapper;

@Repository // Esta notacion le indica a Spring boot que esta clase interactua con la BD
public class ProductoRepository implements ProductRepository { // Repository es la que interactua directamente con la
                                                               // BD.
    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        // return (List<Producto>) productoCrudRepository.findAll(); // Puedo castear el
        // tipo de lista
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        // List<Product> productos =
        // ProductoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.empty();
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
..
    @SuppressWarnings("null")
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    @Override
    public Optional<List<Product>> getScaresProducts(int quantity) {
        // // tODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getScaresProducts'");
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        // tODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }

    @Override
    public Product save(Product product) {
        // tODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(int productId) {
        // tODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
