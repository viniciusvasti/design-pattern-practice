package com.vas.training.designpatterns.behavioral.observer;

public interface Consumer {

	void processMessage(String message);

	int getNumberOfProcessdMessages();
}
