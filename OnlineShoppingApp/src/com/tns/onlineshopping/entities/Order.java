package com.tns.onlineshopping.entities;

import java.util.List;

public class Order {
    private static int counter = 1;
    private int orderId;
    private Customer customer;
    private List<ProductQuantityPair> products;
    private String status;  // Pending, Completed, Delivered, Cancelled

    public Order(Customer customer, List<ProductQuantityPair> products) {
        this.orderId = counter++;
        this.customer = customer;
        this.products = products;
        this.status = "Pending";
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<ProductQuantityPair> getProducts() { return products; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId)
          .append(", Customer: ").append(customer.getUsername())
          .append(", Status: ").append(status).append("\n");
        for (ProductQuantityPair p : products) {
            sb.append("  ").append(p).append("\n");
        }
        return sb.toString();
    }
}
