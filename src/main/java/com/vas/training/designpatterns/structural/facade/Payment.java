package com.vas.training.designpatterns.structural.facade;

public class Payment {

	public String pay(double value) {
		return "Processing payment of " + value + ".\n";
	}

}
