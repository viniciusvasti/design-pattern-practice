package com.vas.training.designpatterns.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Visitor visitor = new Tourist();
		List<Person> personsToVisit = Arrays.asList(new EnglishPerson(), new BrazilianPerson(),
				new GermanPerson());
		personsToVisit.forEach(p -> {
			p.acceptVisitor(visitor);
		});
		visitor.getTravellingDiary().forEach(thingIDid -> System.out.println(thingIDid));
	}

}
