package com.vas.training.designpatterns.behavioral.command;

public class PaymentGateway {

	public static void submit(Command command) {
		command.execute();
	}

	public static void fail(Command command) {
		command.undo();
	}

}
