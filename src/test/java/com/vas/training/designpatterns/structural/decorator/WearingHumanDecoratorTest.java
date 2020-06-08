package com.vas.training.designpatterns.structural.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WearingHumanDecoratorTest {

	@DisplayName("Styling a Man")
	@Test
	void StylingAMan_WithSeveralAccessories() {
		Man man = new Man();
		assertEquals("I'm looking good", man.getLook());
		ManWithWatch manWithWatch = new ManWithWatch(man);
		assertEquals("I'm looking good with a watch", manWithWatch.getLook());
		ManWithHat manWithHat = new ManWithHat(manWithWatch);
		assertEquals("I'm looking good with a watch with a hat", manWithHat.getLook());
		ManWithBracelet manWithBracelet = new ManWithBracelet(manWithHat);
		assertEquals("I'm looking good with a watch with a hat with a bracelet",
				manWithBracelet.getLook());
	}

}
