package com.vas.training.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class KafkaProducer implements Producer {

	List<Consumer> consumers = new ArrayList<Consumer>();

	@Override
	public void subscribe(Consumer consumer) {
		consumers.add(consumer);
	}

	@Override
	public void broadcast(String message) {
		consumers.forEach(c -> c.processMessage(message));
	}

}
