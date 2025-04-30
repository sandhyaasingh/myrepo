package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customerList = new ArrayList<>();

    public void createCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("✅ Customer created successfully!");
    }

    public List<Customer> getAllCustomers() {
        return customerList;
    }

    public Customer getCustomerById(int userId) {
        for (Customer customer : customerList) {
            if (customer.getUserId() == userId) {
                return customer;
            }
        }
        return null;
    }

    public void displayCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("⚠️ No customers found.");
        } else {
            for (Customer c : customerList) {
                System.out.println(c);
            }
        }
    }
}
