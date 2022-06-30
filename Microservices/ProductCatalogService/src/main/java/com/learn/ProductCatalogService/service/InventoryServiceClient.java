package com.learn.ProductCatalogService.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient("inventory-service")
public interface InventoryServiceClient {

    @GetMapping("/api/inventory/{productCode}")
    public Integer getStock(@PathVariable Integer productCode);

}
