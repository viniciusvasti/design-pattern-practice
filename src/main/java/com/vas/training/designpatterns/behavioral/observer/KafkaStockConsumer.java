package com.vas.training.designpatterns.behavioral.observer;

public class KafkaStockConsumer implements Consumer {

	private int processedMessages = 0;

	@Override
	public void processMessage(String message) {
		System.out.println("KafkaStockConsumer - Decreasing 1 product " + message + " from stock");
		processedMessages++;
	}

	public int getNumberOfProcessdMessages() {
		return processedMessages;
	}

}
