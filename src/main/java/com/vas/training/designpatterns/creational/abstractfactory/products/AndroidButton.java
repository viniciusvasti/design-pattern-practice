package com.vas.training.designpatterns.creational.abstractfactory.products;

public class AndroidButton implements Button {

	@Override
	public String render() {
		return "Rendering Android Button";
	}

}
