package org.katrin.demo3_glovo.repository;

import org.katrin.demo3_glovo.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
