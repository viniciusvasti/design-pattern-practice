package com.vas.training.designpatterns.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

class PaymentTemplateMethodTest {

	@Test
	void test() {
		PaymentMethod creditCardPayment = new CreditCardPayment();
		PaymentMethod debitPayment = new DebitPayment();
		PaymentMethod paypalPayment = new PaypalPayment();
		creditCardPayment.pay(100);
		debitPayment.pay(100);
		paypalPayment.pay(100);
	}

}
