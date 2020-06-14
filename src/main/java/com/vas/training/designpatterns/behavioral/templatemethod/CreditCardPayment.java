package com.vas.training.designpatterns.behavioral.templatemethod;

public class CreditCardPayment extends PaymentMethod {

	@Override
	public void notify(int value) {
		System.out.println("Sending Mobile App Push Notification");
	}

	@Override
	public void decreaseLimit(int value) {
		System.out.println("Decreasing credit limit in " + value);
	}

	@Override
	public void checkLimit(int value) {
		System.out.println("Checking credit limit > " + value);
	}

}
