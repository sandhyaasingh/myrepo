package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {
    private List<Order> orderList = new ArrayList<>();

    public void placeOrder(Customer customer) {
        ShoppingCart cart = customer.getShoppingCart();
        if (cart.isEmpty()) {
            System.out.println("⚠️ Cart is empty. Cannot place order.");
            return;
        }

        List<ProductQuantityPair> productPairs = new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product p = entry.getKey();
            int quantity = entry.getValue();

            // Check stock
            if (p.getStockQuantity() < quantity) {
                System.out.println("❌ Not enough stock for: " + p.getName());
                return;
            }

            // Decrease stock
            p.setStockQuantity(p.getStockQuantity() - quantity);
            productPairs.add(new ProductQuantityPair(p, quantity));
        }

        Order order = new Order(customer, productPairs);
        orderList.add(order);
        customer.addOrder(order);
        cart.clearCart();

        System.out.println("✅ Order placed successfully! Order ID: " + order.getOrderId());
    }

    public void updateOrderStatus(int orderId, String newStatus) {
        for (Order order : orderList) {
            if (order.getOrderId() == orderId) {
                order.setStatus(newStatus);
                System.out.println("✅ Order status updated to: " + newStatus);
                return;
            }
        }
        System.out.println("⚠️ Order ID not found.");
    }

    public void displayOrdersForCustomer(Customer customer) {
        List<Order> orders = customer.getOrders();
        if (orders.isEmpty()) {
            System.out.println("⚠️ No orders found for this customer.");
        } else {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

    public void displayAllOrders() {
        if (orderList.isEmpty()) {
            System.out.println("⚠️ No orders available.");
        } else {
            for (Order order : orderList) {
                System.out.println(order);
            }
        }
    }
}
