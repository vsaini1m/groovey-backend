package com.api.backend.groovey.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.backend.groovey.entity.product.Product;

@Repository
public interface ProductRepositery extends JpaRepository<Product, Long>{

}
