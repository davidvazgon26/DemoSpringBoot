package com.demo.davg.domain.repository;

import java.util.List;
import java.util.Optional;

import com.demo.davg.domain.Product;

public interface ProductRepository {
    List<Product> getAll();

    // Save
    Optional<List<Product>> getByCategory(int categoryId);

    Optional<List<Product>> getScaresProducts(int quantity);

    Optional<Product> getProduct(int productId);

    Product save(Product product);

    void delete(int productId);

}
