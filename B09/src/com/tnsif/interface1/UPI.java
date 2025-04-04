package com.tnsif.interface1;  

public class UPI implements Payment {  
    private String payId;  

    public UPI(String payId) {  
        this.payId = payId;  
    }  

    @Override  
    public void process(double amt) {  
        System.out.println("Processing UPI payment of $" + amt + " using UPI ID " + payId);  
    }  
}
