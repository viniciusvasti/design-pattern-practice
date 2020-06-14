package com.vas.training.designpatterns.behavioral.templatemethod;

public abstract class PaymentMethod {

	public void pay(int value) {
		checkLimit(value);
		decreaseLimit(value);
		notify(value);
	}

	public abstract void notify(int value);

	public abstract void decreaseLimit(int value);

	public abstract void checkLimit(int value);

}
