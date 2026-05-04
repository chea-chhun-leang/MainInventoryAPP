package com.app.inventory.inventoryapp.controller;

import com.app.inventory.inventoryapp.model.InventoryItem;
import com.app.inventory.inventoryapp.repository.InventoryRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class InventoryController {
    private final InventoryRepo inventoryRepo;

    public InventoryController(InventoryRepo repository) {
        this.inventoryRepo = repository;
    }

    @GetMapping()
    public List<InventoryItem> getAllItems(){
        return inventoryRepo.findAll();
    }

    @PostMapping
    public InventoryItem addItem(@RequestBody InventoryItem item) {
        return inventoryRepo.save(item);
    }
}
