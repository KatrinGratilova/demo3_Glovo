package org.katrin.demo3_glovo.service;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.converter.OrderConverter;
import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.dto.OrderDto;
import org.katrin.demo3_glovo.entity.OrderEntity;
import org.katrin.demo3_glovo.repository.OrderRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderDto findById(int id) {
        return orderRepository.findById(id).map(OrderConverter::toDto).orElseThrow();
    }

    public OrderDto save(OrderDto orderDto) {
        var order = orderRepository.save(OrderConverter.toEntity(orderDto));
        return OrderConverter.toDto(order);
    }

    public OrderDto addItem(int orderId, ItemDto itemDto){
        OrderEntity order = orderRepository.findById(orderId).orElseThrow();
        //order.getItems().add(Ite)
    }

    public void delete(int id){
        orderRepository.deleteById(id);
    }
}
