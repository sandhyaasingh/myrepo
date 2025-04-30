package com.tns.onlineshopping.entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("🛒 Cart is empty.");
        } else {
            for (Map.Entry<Product, Integer> entry : items.entrySet()) {
                System.out.println("Product: " + entry.getKey().getName() + ", Quantity: " + entry.getValue());
            }
        }
    }
}
