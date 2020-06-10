package com.vas.training.designpatterns.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class MinimumDollarBillsCalculator {

	public static Map<Integer, Integer> numberOfEachDollarBillForPayment(int amount) {
		Map<Integer, Integer> dollarBillsCombination = new HashMap<>();

		OneDollarsBill oneDollarsBill = new OneDollarsBill();
		TwoDollarsBill twoDollarsBill = new TwoDollarsBill();
		FiveDollarsBill fiveDollarsBill = new FiveDollarsBill();
		TenDollarsBill tenDollarsBill = new TenDollarsBill();
		TwentyDollarsBill twentyDollarsBill = new TwentyDollarsBill();
		FiftyDollarsBill fiftyDollarsBill = new FiftyDollarsBill();
		HundredDollarsBill hundredDollarsBill = new HundredDollarsBill();

		hundredDollarsBill.setNext(fiftyDollarsBill);
		fiftyDollarsBill.setNext(twentyDollarsBill);
		twentyDollarsBill.setNext(tenDollarsBill);
		tenDollarsBill.setNext(fiveDollarsBill);
		fiveDollarsBill.setNext(twoDollarsBill);
		twoDollarsBill.setNext(oneDollarsBill);

		hundredDollarsBill.tryPay(amount, dollarBillsCombination);

		return dollarBillsCombination;
	}

}
