package com.vas.training.designpatterns.structural.flyweight;

public class BasicTShirt {

	private BasicTShirtType type;
	private String printedText;

	public BasicTShirt(BasicTShirtType type, String printedText) {
		super();
		this.type = type;
		this.printedText = printedText;
	}

	@Override
	public String toString() {
		return "BasicTShirt [type=" + type + ", printedText=" + printedText + "]";
	}

}
