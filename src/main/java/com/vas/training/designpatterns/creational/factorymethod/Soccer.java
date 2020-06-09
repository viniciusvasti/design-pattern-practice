package com.vas.training.designpatterns.creational.factorymethod;

public class Soccer extends Sport {

	@Override
	Team makeTeam() {
		return new SoccerTeam();
	}

}
