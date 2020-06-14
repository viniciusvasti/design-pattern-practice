package com.vas.training.designpatterns.behavioral.visitor;

public class BrazilianPerson implements Person {

	@Override
	public String offerVisitorADrink() {
		return "Coffee";
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}

}
