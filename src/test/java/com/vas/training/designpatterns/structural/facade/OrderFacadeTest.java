package com.vas.training.designpatterns.structural.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OrderFacadeTest {

	@Test
	void testOrderProduct() {
		OrderFacade facade = new OrderFacade();
		String orderingResult = facade.orderProduct("Notebook", 2000d);

		assertEquals("Starting ordering process\n" +
				"Processing payment of 2000.0.\n" +
				"Withdrawing product Notebook.\n" +
				"Sending product Notebook.\n", orderingResult);
	}

}
