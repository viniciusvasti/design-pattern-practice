package com.vas.training.designpatterns.behavioral.visitor;

public interface Person {

	String offerVisitorADrink();

	void acceptVisitor(Visitor visitor);

}
