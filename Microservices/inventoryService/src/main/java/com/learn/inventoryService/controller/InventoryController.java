package com.learn.inventoryService.controller;


import com.learn.inventoryService.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
@Slf4j
public class InventoryController {

    @GetMapping("{productCode}")
    public Integer getInventory(@PathVariable Integer productCode){
        log.info("Getting product Stock {}", productCode);
        return InventoryRepository.getInventory().get(productCode);
    }
}
