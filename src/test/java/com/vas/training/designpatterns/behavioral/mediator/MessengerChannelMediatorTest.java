package com.vas.training.designpatterns.behavioral.mediator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MessengerChannelMediatorTest {

	@DisplayName("When a user send a message, other use receives it, having the sabe view of chat")
	@Test
	void test() {
		MessengerChannelMediator channel = new SlackChanell();
		TeamMember developer = new TeamMember("Vinicius", channel);
		TeamMember tester = new TeamMember("Rafael", channel);
		assertEquals(developer.getChannelMessageLog(), tester.getChannelMessageLog());
		developer.sendMessage("Hi guys! I've finished login screen!");
		assertEquals(developer.getChannelMessageLog(), tester.getChannelMessageLog());
		tester.sendMessage("Great! I'm going to test it soon");
		assertEquals(developer.getChannelMessageLog(), tester.getChannelMessageLog());
		developer.sendMessage("Nice, man!");
		assertEquals(developer.getChannelMessageLog(), tester.getChannelMessageLog());
	}

}
