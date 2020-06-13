package com.vas.training.designpatterns.behavioral.observer;

public interface Producer {

	void subscribe(Consumer consumer);

	void broadcast(String message);

}
