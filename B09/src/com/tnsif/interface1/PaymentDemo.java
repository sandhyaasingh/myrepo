package com.tnsif.interface1;

public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment c=new CreditCard("a5788665");
		Payment u=new UPI("r98765");
		
		PaymentService ps= new PaymentService();
		ps.makePayment(c,  77);
		ps.makePayment(u,  1000);

	}

}
