package com.vas.training.designpatterns.structural.composite;

public class Product implements TotalPriceCalculator {

	private String name;
	private double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double calculate() {
		return price;
	}

}
