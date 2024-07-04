package org.katrin.demo3_glovo.converter;

import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.entity.ItemEntity;
import org.katrin.demo3_glovo.entity.ProductEntity;

public class ItemConverter {
    public static ItemDto toDto(ItemEntity itemEntity) {
        return ItemDto.builder()
                .id(itemEntity.getId())
                .price(itemEntity.getPrice())
                .quantity(itemEntity.getQuantity())
                .productId(itemEntity.getProduct().getId())
                .build();
    }
    public static ItemEntity toEntity(ItemDto itemDto) {
        return ItemEntity.builder()
                .id(itemDto.getId())
                .price(itemDto.getPrice())
                .quantity(itemDto.getQuantity())
                .product(ProductEntity.builder().id(itemDto.getProductId()).build())
                .build();
    }
}
