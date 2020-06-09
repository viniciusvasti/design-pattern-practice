package com.vas.training.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WorldChampionEnumSingletonTest {

	@DisplayName("Requesting the World Champion should return always the same instance")
	@Test
	void testEnumInstance() {
		WorldChampionEnum worldChampion1 = WorldChampionEnum.INSTANCE;
		WorldChampionEnum worldChampion2 = WorldChampionEnum.INSTANCE;
		assertTrue(worldChampion1 == worldChampion2);
		worldChampion1.setValue("Impostor");
		worldChampion2.setValue("Vinicius");
		assertEquals(worldChampion1.getValue(), worldChampion2.getValue());
	}

}
