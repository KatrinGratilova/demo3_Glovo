package org.katrin.demo3_glovo.service;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.repository.ItemRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ItemService {
    private ItemRepository itemRepository;

    public void save(ItemDto itemDto){}
}
