package com.vas.training.designpatterns.behavioral.mediator;

public class Main {

	public static void main(String[] args) {
		MessengerChannelMediator channel = new SlackChanell();
		TeamMember developer = new TeamMember("Vinicius", channel);
		TeamMember tester = new TeamMember("Rafael", channel);
		developer.sendMessage("Hi guys! I've finished login screen!");
		tester.sendMessage("Great! I'm going to test it soon");
		developer.sendMessage("Nice, man!");
		tester.takeALookInChannel();
	}

}
