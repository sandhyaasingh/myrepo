package com.tnsif.interface1;

import com.tnsif.interface1.Payment;

public class UPI implements Payment{
	private String upiId;
	
	public UPI(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing UPI Payment of Rs. "+amt+" using UPI ID: "+upiId);
		
	}

}