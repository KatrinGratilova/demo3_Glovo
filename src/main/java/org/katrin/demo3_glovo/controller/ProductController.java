package org.katrin.demo3_glovo.controller;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.dto.ProductDto;
import org.katrin.demo3_glovo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable int id){
        return productService.getById(id);
    }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto productDto){
        return productService.save(productDto);
    }

    @PutMapping
    public ProductDto update(@RequestBody ProductDto productDto){
        return productService.update(productDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

}
