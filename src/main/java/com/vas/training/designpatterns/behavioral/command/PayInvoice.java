package com.vas.training.designpatterns.behavioral.command;

public class PayInvoice implements Command {

	private final CreditAccount creditAccount;
	private final int invoiceValue;
	private boolean canUndo = false;

	public PayInvoice(CreditAccount creditAccount, int invoiceValue) {
		super();
		this.creditAccount = creditAccount;
		this.invoiceValue = invoiceValue;
	}

	@Override
	public void execute() {
		creditAccount.payInvoice(invoiceValue);
		canUndo = true;
	}

	@Override
	public void undo() {
		if (canUndo)
			creditAccount.cancelInvoiceàyment(invoiceValue);

	}

}
