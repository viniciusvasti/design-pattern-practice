package com.vas.training.designpatterns.behavioral.mediator;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class SlackChanell implements MessengerChannelMediator {

	private List<String> messages = new LinkedList<String>();

	@Override
	public void addMessage(String sender, String message) {
		LocalDateTime dateTime = LocalDateTime.now();
		messages.add("[" + dateTime + "] | " + sender + ": " + message);
	}

	@Override
	public String getMessageLog() {
		return messages.stream().reduce("", (msgLog, msg) -> {
			return msgLog + "\n" + msg;
		});
	}

}
