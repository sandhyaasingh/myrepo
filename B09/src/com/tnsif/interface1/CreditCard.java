package com.tnsif.interface1;

public class CreditCard implements Payment {
	private String cardNo;
	
	public CreditCard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing Credit Card payment of $" + amt + " using card " + cardNo);

		
	}

}
