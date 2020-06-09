package com.vas.training.designpatterns.creational.factorymethod;

public class Basketball extends Sport {

	@Override
	Team makeTeam() {
		return new BasketballTeam();
	}

}
