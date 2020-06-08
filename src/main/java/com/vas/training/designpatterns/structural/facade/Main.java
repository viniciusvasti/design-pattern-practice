package com.vas.training.designpatterns.structural.facade;

public class Main {

	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		facade.orderProduct("Notebook", 2000d);
	}

}
