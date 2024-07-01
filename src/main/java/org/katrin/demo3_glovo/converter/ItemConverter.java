package org.katrin.demo3_glovo.converter;

import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.entity.ItemEntity;

public class ItemConverter {
    public static ItemDto toDto(ItemEntity itemEntity) {
        return ItemDto.builder()
                .id(itemEntity.getId())
                .price(itemEntity.getPrice())
                .quantity(itemEntity.getQuantity())
                .product(ProductConverter.toDto(itemEntity.getProduct()))
                .build();
    }
}
