package org.ericwubbo.derivedqueriesdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping
    public Iterable<Item> getAll() {
        return itemRepository.findAll();
    }

    @GetMapping("/search/{query}")
    public List<Item> searchByName(@PathVariable String query) {
        return itemRepository.findAllByNameContainingIgnoringCase(query);
    }
}
