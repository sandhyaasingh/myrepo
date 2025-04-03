package com.tnsif.bankingsystem;

public class BankApplication {
    public static void main(String[] args) {
        // Create a Savings Account with ₹1000 initial balance and 5% interest
        SavingsAccount savings = new SavingsAccount(1000, 5);
        savings.deposit(500);
        savings.withdraw(300);
        System.out.println("Savings Account Balance: " + savings.getBalance());

        // Create a Checking Account with ₹500 initial balance and ₹200 overdraft limit
        CheckingAccount checking = new CheckingAccount(500, 200);
        checking.deposit(200);
        checking.withdraw(800); // Should be allowed due to overdraft
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
