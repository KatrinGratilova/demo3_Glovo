package org.katrin.demo3_glovo.controller;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.dto.OrderDto;
import org.katrin.demo3_glovo.service.OrderService;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable int id) {
        return orderService.findById(id);
    }

    @PostMapping("/{orderId}/items")
    public OrderDto addItem(@PathVariable int orderId, @RequestBody ItemDto itemDto) {
        return null;
    }

    @GetMapping("/{orderId}/items")
    public OrderDto getItems(@PathVariable int orderId) {
        return null;
    }
}
