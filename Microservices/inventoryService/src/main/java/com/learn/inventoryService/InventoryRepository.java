package com.learn.inventoryService;

import java.util.HashMap;
import java.util.Map;

public class InventoryRepository {
    private static Map<Integer, Integer> inventory = new HashMap<>(Map.of(101, 10, 102, 5, 103, 25));

    public static Map<Integer, Integer> getInventory() {
        return inventory;
    }
}