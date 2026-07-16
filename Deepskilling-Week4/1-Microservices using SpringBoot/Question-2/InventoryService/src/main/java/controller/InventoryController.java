package com.cognizant.inventoryservice.controller;

import com.cognizant.inventoryservice.entity.Inventory;
import com.cognizant.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inventory){
        return service.saveInventory(inventory);
    }

    @GetMapping
    public List<Inventory> getAllInventory(){
        return service.getAllInventory();
    }

    @GetMapping("/{productId}")
    public Inventory getInventory(@PathVariable Long productId){
        return service.getInventoryByProductId(productId);
    }

}