package com.vas.training.designpatterns.behavioral.mediator;

public interface MessengerChannelMediator {
	void addMessage(String sender, String message);

	String getMessageLog();
}
