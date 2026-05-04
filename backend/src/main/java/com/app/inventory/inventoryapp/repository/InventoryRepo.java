package com.app.inventory.inventoryapp.repository;

import com.app.inventory.inventoryapp.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository <InventoryItem,Long> {
}
