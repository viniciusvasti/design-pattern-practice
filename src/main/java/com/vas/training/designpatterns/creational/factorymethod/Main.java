package com.vas.training.designpatterns.creational.factorymethod;

public class Main {

	public static void main(String[] args) {
		Sport soccer = new Soccer();
		System.out.println(soccer.startGame());
		Sport basketball = new Basketball();
		System.out.println(basketball.startGame());
	}

}
