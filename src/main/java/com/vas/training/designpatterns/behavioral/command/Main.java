package com.vas.training.designpatterns.behavioral.command;

public class Main {

	public static void main(String[] args) {
		CreditAccount creditAccount = new CreditAccount(1000);
		System.out.println(creditAccount.getLimit());

		UseCredit useCredit = new UseCredit(creditAccount, 200);
		PaymentGateway.submit(useCredit);
		System.out.println(creditAccount.getLimit());

		PayInvoice payInvoice = new PayInvoice(creditAccount, 100);
		PaymentGateway.submit(payInvoice);
		System.out.println(creditAccount.getLimit());

		UseCredit useCreditAgain = new UseCredit(creditAccount, 500);
		PaymentGateway.submit(useCreditAgain);
		System.out.println(creditAccount.getLimit());
		PaymentGateway.fail(useCreditAgain);
		System.out.println(creditAccount.getLimit());
	}

}
