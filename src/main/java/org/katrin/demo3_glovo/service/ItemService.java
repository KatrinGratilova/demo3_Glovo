package org.katrin.demo3_glovo.service;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.converter.ItemConverter;
import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ItemService {
    private ItemRepository itemRepository;

    public void save(ItemDto itemDto){}

    public List<ItemDto> findByOrderId(int orderId){
        return itemRepository.getByOrderId(orderId).stream().map(ItemConverter::toDto).toList();
    }

    public ItemDto update(ItemDto itemDto){
        var item = itemRepository.save(ItemConverter.toEntity(itemDto));
        itemDto.setId(item.getId());
        return itemDto;
    }

    public void delete(int id){
        itemRepository.deleteById(id);
    }
}
