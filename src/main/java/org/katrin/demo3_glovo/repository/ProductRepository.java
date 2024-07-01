package org.katrin.demo3_glovo.repository;

import org.katrin.demo3_glovo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
