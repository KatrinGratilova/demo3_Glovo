package org.katrin.demo3_glovo.controller;

import lombok.AllArgsConstructor;
import org.katrin.demo3_glovo.dto.ItemDto;
import org.katrin.demo3_glovo.service.ItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PutMapping
    public ItemDto update(@RequestBody ItemDto itemDto) {
        return itemService.update(itemDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        itemService.delete(id);
    }
}
