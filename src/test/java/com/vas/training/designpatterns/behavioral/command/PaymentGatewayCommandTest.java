package com.vas.training.designpatterns.behavioral.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaymentGatewayCommandTest {

	@Test
	void test() {
		CreditAccount creditAccount = new CreditAccount(1000);
		assertEquals(1000, creditAccount.getLimit());

		UseCredit useCredit = new UseCredit(creditAccount, 200);
		PaymentGateway.submit(useCredit);
		assertEquals(800, creditAccount.getLimit());

		PayInvoice payInvoice = new PayInvoice(creditAccount, 100);
		PaymentGateway.submit(payInvoice);
		assertEquals(900, creditAccount.getLimit());

		UseCredit useCreditAgain = new UseCredit(creditAccount, 500);
		PaymentGateway.submit(useCreditAgain);
		assertEquals(400, creditAccount.getLimit());
		PaymentGateway.fail(useCreditAgain);
		assertEquals(900, creditAccount.getLimit());
	}

}
