package com.planner.persistence;

import com.planner.persistence.crud.ProductoCrudRepository;
import com.planner.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
