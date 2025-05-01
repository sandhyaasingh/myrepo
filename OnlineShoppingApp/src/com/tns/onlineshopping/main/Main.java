package com.tns.onlineshopping.main;

import com.tns.onlineshopping.entities.*;
import com.tns.onlineshopping.services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Services
        ProductService productService = new ProductService();
        CustomerService customerService = new CustomerService();
        AdminService adminService = new AdminService();
        OrderService orderService = new OrderService();

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    adminMenu(sc, productService, adminService, orderService);
                    break;
                case 2:
                    customerMenu(sc, productService, customerService, orderService);
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void adminMenu(Scanner sc, ProductService ps, AdminService as, OrderService os) {
        while (true) {
            System.out.println("\n ADMIN MENU");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Stock Quantity: ");
                    int qty = sc.nextInt();
                    ps.addProduct(new Product(id, name, price, qty));
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    ps.removeProduct(sc.nextInt());
                    break;

                case 3:
                    ps.viewProducts();
                    break;

                case 4:
                    System.out.print("Enter Admin ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String aname = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String aemail = sc.nextLine();
                    as.createAdmin(new Admin(aid, aname, aemail));
                    break;

                case 5:
                    as.displayAdmins();
                    break;

                case 6:
                    System.out.print("Enter Order ID: ");
                    int oid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
                    String status = sc.nextLine();
                    os.updateOrderStatus(oid, status);
                    break;

                case 7:
                    os.displayAllOrders();
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void customerMenu(Scanner sc, ProductService ps, CustomerService cs, OrderService os) {
        while (true) {
            System.out.println("\n CUSTOMER MENU");
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. View Products");
            System.out.println("6. Add to Cart");
            System.out.println("7. View Cart");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String cemail = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String caddr = sc.nextLine();
                    cs.createCustomer(new Customer(cid, cname, cemail, caddr));
                    break;

                case 2:
                    cs.displayCustomers();
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    Customer customer = cs.getCustomerById(sc.nextInt());
                    if (customer != null) {
                        os.placeOrder(customer);
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    Customer c = cs.getCustomerById(sc.nextInt());
                    if (c != null) {
                        os.displayOrdersForCustomer(c);
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 5:
                    ps.viewProducts();
                    break;

                case 6:
                    System.out.print("Enter Customer ID: ");
                    Customer cust = cs.getCustomerById(sc.nextInt());
                    if (cust != null) {
                        ps.viewProducts();
                        while (true) {
                            System.out.print("Enter Product ID to add (or -1 to stop): ");
                            int pid = sc.nextInt();
                            if (pid == -1) break;
                            System.out.print("Enter Quantity: ");
                            int q = sc.nextInt();
                            Product p = ps.getProductById(pid);
                            if (p != null) {
                                cust.getShoppingCart().addProduct(p, q);
                            } else {
                                System.out.println("Product not found.");
                            }
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Customer ID: ");
                    Customer cartCust = cs.getCustomerById(sc.nextInt());
                    if (cartCust != null) {
                        cartCust.getShoppingCart().displayCart();
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
