package com.vas.training.designpatterns.behavioral.visitor;

public class EnglishPerson implements Person {

	@Override
	public String offerVisitorADrink() {
		return "Tea";
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}

}
