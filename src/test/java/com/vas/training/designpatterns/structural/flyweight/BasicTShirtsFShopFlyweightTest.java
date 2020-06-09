package com.vas.training.designpatterns.structural.flyweight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTShirtsFShopFlyweightTest {

	@DisplayName("Creating some basic t shirts shouldn't create repeated types os basic t shirts")
	@Test
	void createSomeBasicTShirts() {
		assertEquals(0, BasicTShirtFactory.getTypesCount());
		BasicTShirt basicTShirt = BasicTShirtFactory.getBasicTShirt("Black", false, "Java Rocks!");
		assertEquals(1, BasicTShirtFactory.getTypesCount());
		BasicTShirt basicTShirt2 = BasicTShirtFactory.getBasicTShirt("White", false, "Java Rocks!");
		assertEquals(2, BasicTShirtFactory.getTypesCount());
		BasicTShirt basicTShirt3 = BasicTShirtFactory.getBasicTShirt("Black", false,
				"JavaScript is fine!");
		assertEquals(2, BasicTShirtFactory.getTypesCount());
		BasicTShirt basicTShirt4 = BasicTShirtFactory.getBasicTShirt("White", false,
				"JavaScript is fine!");
		assertEquals(2, BasicTShirtFactory.getTypesCount());
		BasicTShirt basicTShirt5 = BasicTShirtFactory.getBasicTShirt("Blue", false,
				"JavaScript is fine!");
		assertEquals(3, BasicTShirtFactory.getTypesCount());
		BasicTShirt basicTShirt6 = BasicTShirtFactory.getBasicTShirt("White", true,
				"JavaScript is fine!");
		assertEquals(4, BasicTShirtFactory.getTypesCount());
	}

}
