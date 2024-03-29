package com.demo.davg.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.demo.davg.domain.Category;
import com.demo.davg.persistence.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId")
    })
    Category toCategory(Categoria categoria);

    @InheritConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Categoria categoria);

}
