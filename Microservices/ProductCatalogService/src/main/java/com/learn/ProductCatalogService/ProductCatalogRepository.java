package com.learn.ProductCatalogService;

import com.learn.ProductCatalogService.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


public class ProductCatalogRepository {

    private static Map<Integer, Product> products = new HashMap<>(Map.of(
            101, new Product(101, "keyboard", 500),
            102, new Product(102, "Laptop", 50000),
            103, new Product(103, "jeans", 2000)
    ));

    public static Map<Integer, Product> getProducts() {
        return products;
    }
}
