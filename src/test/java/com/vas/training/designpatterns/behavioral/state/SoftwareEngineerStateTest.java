package com.vas.training.designpatterns.behavioral.state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SoftwareEngineerStateTest {

	@DisplayName("Software Engineer state should change in this way: Sleeping -> Analyzing a backlog feature -> Coding that feature -> Testing coded feature -> Studying something -> Sleeping")
	@Test
	void test() {
		SoftwareEngineer vinicius = new SoftwareEngineer();
		assertEquals(SoftwareEngineerStates.SLEEPING, vinicius.getWhatHesDoing(),
				"Software Engineer is sleeping");
		vinicius.doNextJobTask();
		assertEquals(SoftwareEngineerStates.ANALYZING_BACKLOG_FEATURE, vinicius
				.getWhatHesDoing(),
				"Software Engineer is analyzing a backlog feature");
		vinicius.doNextJobTask();
		assertEquals(SoftwareEngineerStates.CODING, vinicius.getWhatHesDoing(),
				"Software Engineer is coding a feature");
		vinicius.doNextJobTask();
		assertEquals(SoftwareEngineerStates.TESTING, vinicius.getWhatHesDoing(),
				"Software Engineer is testing a feature");
		vinicius.doNextJobTask();
		assertEquals(SoftwareEngineerStates.STUDYING, vinicius.getWhatHesDoing(),
				"Software Engineer is studying");
		vinicius.doNextJobTask();
		assertEquals(SoftwareEngineerStates.SLEEPING, vinicius.getWhatHesDoing(),
				"Software Engineer is sleeping again");
	}

}
