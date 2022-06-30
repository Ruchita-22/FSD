package com.learn.ProductCatalogService.controller;

import com.learn.ProductCatalogService.ProductCatalogRepository;
import com.learn.ProductCatalogService.model.Product;
import com.learn.ProductCatalogService.model.ProductInventory;
import com.learn.ProductCatalogService.service.InventoryServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@Slf4j
public class ProductCatalogController {

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @GetMapping("/{productCode}")
    public ProductInventory getProduct(@PathVariable int productCode) {
        log.info("Getting Product details for {}", productCode);
        Product product = ProductCatalogRepository.getProducts().get(productCode);
        //todo: call inventory service sync to get stock information
        log.info("Getting Product Stock for {}", productCode);
        Integer stock = inventoryServiceClient.getStock(productCode);
        return ProductInventory.builder().product(product).quantity(stock).build();
    }
}