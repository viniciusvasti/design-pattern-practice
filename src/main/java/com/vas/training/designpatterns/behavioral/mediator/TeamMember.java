package com.vas.training.designpatterns.behavioral.mediator;

public class TeamMember {

	private MessengerChannelMediator channel;
	private String name;

	public TeamMember(String name, MessengerChannelMediator channel) {
		super();
		this.channel = channel;
		this.name = name;
	}

	public void sendMessage(String message) {
		channel.addMessage(name, message);
	}

	public void takeALookInChannel() {
		System.out.print(name + " view of channel:");
		System.out.println(channel.getMessageLog());
	}

	public String getChannelMessageLog() {
		return channel.getMessageLog();
	}

}
