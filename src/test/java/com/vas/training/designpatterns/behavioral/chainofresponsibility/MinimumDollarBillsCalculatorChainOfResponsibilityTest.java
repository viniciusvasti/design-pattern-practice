package com.vas.training.designpatterns.behavioral.chainofresponsibility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MinimumDollarBillsCalculatorChainOfResponsibilityTest {

	@Test
	void testNumberOfEachDollarBillForPayment() {
		Map<Integer, Integer> dollarBillsCombination = MinimumDollarBillsCalculator
				.numberOfEachDollarBillForPayment(988);
		assertEquals(9, dollarBillsCombination.get(100));
		assertEquals(1, dollarBillsCombination.get(50));
		assertEquals(1, dollarBillsCombination.get(20));
		assertEquals(1, dollarBillsCombination.get(10));
		assertEquals(1, dollarBillsCombination.get(5));
		assertEquals(1, dollarBillsCombination.get(2));
		assertEquals(1, dollarBillsCombination.get(1));
	}

}
