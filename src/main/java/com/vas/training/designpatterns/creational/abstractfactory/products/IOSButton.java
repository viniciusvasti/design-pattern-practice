package com.vas.training.designpatterns.creational.abstractfactory.products;

public class IOSButton implements Button {

	@Override
	public String render() {
		return "Rendering IOS Button";
	}

}
