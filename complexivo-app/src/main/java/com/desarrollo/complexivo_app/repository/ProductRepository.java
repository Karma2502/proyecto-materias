package com.desarrollo.complexivo_app.repository;

import com.desarrollo.complexivo_app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
