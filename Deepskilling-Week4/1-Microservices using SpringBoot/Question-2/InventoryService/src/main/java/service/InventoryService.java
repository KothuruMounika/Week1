package com.cognizant.inventoryservice.service;

import com.cognizant.inventoryservice.entity.Inventory;
import com.cognizant.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repository;

    public Inventory saveInventory(Inventory inventory){
        return repository.save(inventory);
    }

    public List<Inventory> getAllInventory(){
        return repository.findAll();
    }

    public Inventory getInventoryByProductId(Long productId){
        return repository.findByProductId(productId).orElse(null);
    }

}