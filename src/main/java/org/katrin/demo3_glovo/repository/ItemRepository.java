package org.katrin.demo3_glovo.repository;

import org.katrin.demo3_glovo.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
    List<ItemEntity> getByOrderId(int orderId);
}
