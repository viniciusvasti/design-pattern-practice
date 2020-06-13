package com.vas.training.designpatterns.behavioral.observer;

public class KafkaBiConsumer implements Consumer {

	private int processedMessages = 0;

	@Override
	public void processMessage(String message) {
		System.out.println(
				"kafkaBIConsumer - Increasing 1 product " + message + " on  monthly sales");
		processedMessages++;
	}

	public int getNumberOfProcessdMessages() {
		return processedMessages;
	}

}
