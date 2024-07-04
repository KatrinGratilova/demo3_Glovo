package org.katrin.demo3_glovo.controller;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.dto.OrderDto;
import org.katrin.demo3_glovo.service.ItemService;
import org.katrin.demo3_glovo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;
    private ItemService itemService;

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable int id) {
        return orderService.findById(id);
    }

    @PostMapping
    public OrderDto save(@RequestBody OrderDto orderDto) {
        return orderService.save(orderDto);
    }

    @PostMapping("/{orderId}/items")
    public OrderDto addItem(@PathVariable int orderId, @RequestBody ItemDto itemDto) {
        return null;
    }

    @GetMapping("/{orderId}/items")
    public List<ItemDto> getItems(@PathVariable int orderId) {
        return itemService.findByOrderId(orderId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        orderService.delete(id);
    }
}
