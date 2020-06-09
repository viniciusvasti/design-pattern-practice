package com.vas.training.designpatterns.creational.factorymethod;

public abstract class Sport {

	// Factory Method
	abstract Team makeTeam();

	public String startGame() {
		Team team = this.makeTeam();
		return team.play();
	}

}
