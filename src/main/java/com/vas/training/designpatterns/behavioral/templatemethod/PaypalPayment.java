package com.vas.training.designpatterns.behavioral.templatemethod;

public class PaypalPayment extends PaymentMethod {

	@Override
	public void notify(int value) {
		System.out.println("Sending email");
	}

	@Override
	public void decreaseLimit(int value) {
		System.out.println("Decreasing balance of Paypal Account in " + value);
	}

	@Override
	public void checkLimit(int value) {
		System.out.println("Checking if balance of Paypal Account > " + value);
	}

}
