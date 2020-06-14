package com.vas.training.designpatterns.behavioral.visitor;

public class GermanPerson implements Person {

	@Override
	public String offerVisitorADrink() {
		return "Beer";
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}

}
