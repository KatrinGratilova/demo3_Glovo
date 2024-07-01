package org.katrin.demo3_glovo.service;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.converter.ProductConverter;
import org.katrin.demo3_glovo.dto.ProductDto;
import org.katrin.demo3_glovo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public ProductDto getById(int id){
        return productRepository.findById(id)
                .map(ProductConverter::toDto)
                .orElseThrow();
    }

    public List<ProductDto> getAll(){
        return productRepository.findAll().stream()
                .map(ProductConverter::toDto)
                .toList();
    }

    public ProductDto save(ProductDto productDto){
        var product = productRepository.save(ProductConverter.toEntity(productDto));
        return ProductConverter.toDto(product);
    }

    public ProductDto update(ProductDto productDto){
        return save(productDto);
    }

    public void delete(int id){
        productRepository.deleteById(id);
    }

}
