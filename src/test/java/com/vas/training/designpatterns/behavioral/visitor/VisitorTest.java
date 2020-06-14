package com.vas.training.designpatterns.behavioral.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VisitorTest {

	@DisplayName("Tourist visiting an English home, a Brazilian home and a German home should drank Tea, Coffee and Beer, respectively")
	@Test
	void test() {
		Visitor visitor = new Tourist();
		List<Person> personsToVisit = Arrays.asList(new EnglishPerson(), new BrazilianPerson(),
				new GermanPerson());
		personsToVisit.forEach(p -> {
			p.acceptVisitor(visitor);
		});
		assertEquals(3, visitor.getTravellingDiary().size());
		assertEquals("Drank Tea in English home", visitor.getTravellingDiary().get(0));
		assertEquals("Drank Coffee in Brazilian home", visitor.getTravellingDiary().get(1));
		assertEquals("Drank Beer in German home", visitor.getTravellingDiary().get(2));
	}

}
