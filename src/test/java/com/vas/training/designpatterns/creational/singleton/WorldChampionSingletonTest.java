package com.vas.training.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WorldChampionSingletonTest {

	@DisplayName("Requesting the World Champion should return always the same instance")
	@Test
	void testGetInstance() {
		WorldChampion worldChampion1 = WorldChampion.getInstance();
		WorldChampion worldChampion2 = WorldChampion.getInstance();
		assertTrue(worldChampion1 == worldChampion2);
		worldChampion1.setName("Impostor");
		worldChampion2.setName("Vinicius");
		assertEquals(worldChampion1.getName(), worldChampion2.getName());
	}

	@DisplayName("Shouldn't be possible to clone the World Champion")
	@Test
	void testClone() throws CloneNotSupportedException {
		WorldChampion worldChampion1 = WorldChampion.getInstance();
		assertThrows(RuntimeException.class, () -> {
			WorldChampion worldChampion2 = (WorldChampion) worldChampion1.clone();
		});
	}

}
