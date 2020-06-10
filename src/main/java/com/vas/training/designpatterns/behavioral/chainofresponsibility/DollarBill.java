package com.vas.training.designpatterns.behavioral.chainofresponsibility;

import java.util.Map;

public abstract class DollarBill {

	private DollarBill next = null;
	private int value;

	public DollarBill(int value) {
		this.value = value;
	}

	public void setNext(DollarBill next) {
		this.next = next;
	}

	public void tryPay(int amount, Map<Integer, Integer> dollarBillsCombination) {
		int numberOfBanknotes = (int) (amount / value);
		if (numberOfBanknotes > 0) {
			dollarBillsCombination.put(value, numberOfBanknotes);
			System.out.println(
					"Using " + numberOfBanknotes + " banknotes of " + value + " Dollars bill");
		}
		int rest = amount - numberOfBanknotes * value;
		if (rest > 0 && next != null)
			next.tryPay(rest, dollarBillsCombination);
	}

}
