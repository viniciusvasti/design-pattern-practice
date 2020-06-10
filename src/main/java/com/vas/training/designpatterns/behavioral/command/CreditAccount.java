package com.vas.training.designpatterns.behavioral.command;

public class CreditAccount {

	private int limit;

	public CreditAccount(int limit) {
		super();
		this.limit = limit;
	}

	public void pay(int value) {
		limit -= value;
	}

	public void reversePayment(int value) {
		limit += value;
	}

	public void payInvoice(int value) {
		limit += value;
	}

	public void cancelInvoiceàyment(int value) {
		limit -= value;
	}

	public int getLimit() {
		return limit;
	}

}
