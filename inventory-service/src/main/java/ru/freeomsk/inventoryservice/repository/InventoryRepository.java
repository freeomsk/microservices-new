package ru.freeomsk.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.freeomsk.inventoryservice.model.Inventory;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
