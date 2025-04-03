package com.tnsif.bankingsystem;

public abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
