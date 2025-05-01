package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList = new ArrayList<>();

    // Add a product
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    // Remove a product by ID
    public void removeProduct(int productId) {
        productList.removeIf(product -> product.getProductId() == productId);
        System.out.println("Product removed successfully!");
    }

    // View all products
    public void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    // This is the missing piece you need
    public Product getProductById(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
}
