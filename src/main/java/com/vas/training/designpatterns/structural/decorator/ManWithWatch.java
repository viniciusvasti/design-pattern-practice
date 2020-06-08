package com.vas.training.designpatterns.structural.decorator;

public class ManWithWatch implements Human {

	private Human human;

	public ManWithWatch(Human human) {
		super();
		this.human = human;
	}

	@Override
	public String getLook() {
		return human.getLook() + " with a watch";
	}

}
