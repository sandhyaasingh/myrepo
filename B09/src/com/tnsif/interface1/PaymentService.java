package com.tnsif.interface1;

public class PaymentService {
	void makePayment(Payment pay, double amount) {
		pay.process(amount);
	}

}
