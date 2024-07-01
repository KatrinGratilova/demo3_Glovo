package org.katrin.demo3_glovo.converter;

import org.katrin.demo3_glovo.dto.ProductDto;
import org.katrin.demo3_glovo.entity.ProductEntity;

public class ProductConverter {
    public static ProductDto toDto(ProductEntity productEntity){
        return ProductDto.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .country(productEntity.getCountry())
                .price(productEntity.getPrice())
                .build();
    }

    public static ProductEntity toEntity(ProductDto productDto){
        return ProductEntity.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .country(productDto.getCountry())
                .price(productDto.getPrice())
                .build();
    }
}
