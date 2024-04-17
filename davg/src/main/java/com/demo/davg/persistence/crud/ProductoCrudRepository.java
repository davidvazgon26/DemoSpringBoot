package com.demo.davg.persistence.crud;

// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.demo.davg.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery
    // = true);

    List<Producto> findByIdCategoria(Integer idCategoria); // Se consume en ProductoRepository

    Optional<List<Producto>> findByCantidadStockLessTHanAndEstado(int cantidadStock, Boolean estado);
}
