package com.desarrollo.complexivo_app.repository;

import com.desarrollo.complexivo_app.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
