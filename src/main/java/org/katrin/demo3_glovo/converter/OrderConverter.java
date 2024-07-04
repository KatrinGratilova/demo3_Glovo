package org.katrin.demo3_glovo.converter;

import org.katrin.demo3_glovo.dto.OrderDto;
import org.katrin.demo3_glovo.entity.ItemEntity;
import org.katrin.demo3_glovo.entity.OrderEntity;

import java.sql.Date;

public class OrderConverter {

    public static OrderDto toDto(OrderEntity orderEntity) {
        return OrderDto.builder()
                .id(orderEntity.getId())
                .checkoutDate(orderEntity.getCheckoutDate())
                .userName(orderEntity.getUserName())
                .totalPrice(orderEntity.getTotalPrice())
                .items(orderEntity.getItems().stream().map(ItemEntity::getId).toList())
                .build();
    }

    public static OrderEntity toEntity(OrderDto orderDto) {
        return OrderEntity.builder()
                .id(orderDto.getId())
                .checkoutDate(orderDto.getCheckoutDate())
                .userName(orderDto.getUserName())
                .totalPrice(orderDto.getTotalPrice())
                .build();
    }
}
