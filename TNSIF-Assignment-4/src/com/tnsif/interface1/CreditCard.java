package com.tnsif.interface1;

import com.tnsif.interface1.Payment;

public class CreditCard implements Payment{
	private String cardNo;

	public CreditCard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing credit card payment of Rs. "+amt+" using Credit Card No.: "+cardNo);
		
	}
}