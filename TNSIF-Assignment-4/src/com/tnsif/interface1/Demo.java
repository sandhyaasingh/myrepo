package com.tnsif.interface1;

public class Demo {

    public static void main(String[] args) {
        Payment creditcard = new CreditCard("123");
        creditcard.process(2000);

        Payment upi = new UPI("sandhya@ybl"); 
        upi.process(1000);

        Payment debitcard = new DebitCard("3473856844542345"); 
        debitcard.process(3000);
    }
}
