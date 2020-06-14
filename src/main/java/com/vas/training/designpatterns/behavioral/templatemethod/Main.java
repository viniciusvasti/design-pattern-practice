package com.vas.training.designpatterns.behavioral.templatemethod;

public class Main {

	public static void main(String[] args) {
		PaymentMethod creditCardPayment = new CreditCardPayment();
		PaymentMethod debitPayment = new DebitPayment();
		PaymentMethod paypalPayment = new PaypalPayment();
		System.out.println("Paying with credit card");
		creditCardPayment.pay(100);
		System.out.println("Paying with account debit");
		debitPayment.pay(100);
		System.out.println("Paying with Paypal");
		paypalPayment.pay(100);
	}

}
