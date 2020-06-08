package com.vas.training.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements TotalPriceCalculator {

	List<Product> products = new ArrayList<>();
	List<Box> boxes = new ArrayList<>();

	public List<Box> getBoxes() {
		return boxes;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public double calculate() {
		float totalPrice = 0F;

		totalPrice += productsTotalPrice();
		totalPrice += boxesTotalPrice();

		return totalPrice;
	}

	private double boxesTotalPrice() {
		return boxes.stream().mapToDouble(b -> b.calculate()).sum();
	}

	private double productsTotalPrice() {
		return products.stream().mapToDouble(p -> p.calculate()).sum();
	}

}
