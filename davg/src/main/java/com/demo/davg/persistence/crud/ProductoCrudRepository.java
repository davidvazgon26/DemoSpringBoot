package com.demo.davg.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import com.demo.davg.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
