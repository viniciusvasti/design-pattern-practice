package com.vas.training.designpatterns.structural.facade;

public class OrderFacade {

	public String orderProduct(String product, Double price) {
		String ordering = "Starting ordering process\n";
		System.out.println(ordering);

		Payment payment = new Payment();
		String paying = payment.pay(price);
		System.out.println(paying);

		Stocking stocking = new Stocking();
		String withdrawing = stocking.withdrawProduct(product);
		System.out.println(withdrawing);

		Shipment shipment = new Shipment();
		String shipping = shipment.sendProduct(product);
		System.out.println(shipping);

		System.out.println("Ordering completed.");

		return ordering.concat(paying).concat(withdrawing).concat(shipping);
	}

}
