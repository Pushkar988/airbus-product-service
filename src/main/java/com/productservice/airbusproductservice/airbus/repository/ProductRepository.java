package com.productservice.airbusproductservice.airbus.repository;

import com.productservice.airbusproductservice.airbus.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findByCategoryIgnoreCase(String category);
}
