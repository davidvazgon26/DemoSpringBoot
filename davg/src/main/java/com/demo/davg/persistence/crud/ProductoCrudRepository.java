package com.demo.davg.persistence.crud;

// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.demo.davg.persistence.entity.Producto;
import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery
    // = true);
    List<Producto> findByIdCategoria(Integer idCategoria);
}
