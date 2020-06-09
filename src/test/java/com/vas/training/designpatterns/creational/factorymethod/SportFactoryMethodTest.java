package com.vas.training.designpatterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SportFactoryMethodTest {

	@DisplayName("Soccer platers should play with feet, basketball player should play with hands")
	@Test
	void testStartGame() {
		Sport soccer = new Soccer();
		assertEquals("Playing with feet", soccer.startGame());
		Sport basketball = new Basketball();
		assertEquals("Playing with hands", basketball.startGame());
	}

}
