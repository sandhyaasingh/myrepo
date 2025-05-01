package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Admin> adminList = new ArrayList<>();

    public void createAdmin(Admin admin) {
        adminList.add(admin);
        System.out.println("Admin created successfully!");
    }

    public List<Admin> getAllAdmins() {
        return adminList;
    }

    public void displayAdmins() {
        if (adminList.isEmpty()) {
            System.out.println("No admins found.");
        } else {
            for (Admin admin : adminList) {
                System.out.println(admin);
            }
        }
    }
}
