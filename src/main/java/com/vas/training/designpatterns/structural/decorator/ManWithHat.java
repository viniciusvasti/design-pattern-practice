package com.vas.training.designpatterns.structural.decorator;

public class ManWithHat implements Human {

	private Human human;

	public ManWithHat(Human human) {
		super();
		this.human = human;
	}

	@Override
	public String getLook() {
		return human.getLook() + " with a hat";
	}

}
