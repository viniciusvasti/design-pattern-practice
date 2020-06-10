package com.vas.training.designpatterns.behavioral.command;

public class UseCredit implements Command {

	private final CreditAccount creditAccount;
	private final int usingValue;
	private boolean canUndo = false;

	public UseCredit(CreditAccount creditAccount, int usingValue) {
		super();
		this.creditAccount = creditAccount;
		this.usingValue = usingValue;
	}

	@Override
	public void execute() {
		creditAccount.pay(usingValue);
		canUndo = true;
	}

	@Override
	public void undo() {
		if (canUndo)
			creditAccount.reversePayment(usingValue);
	}

}
