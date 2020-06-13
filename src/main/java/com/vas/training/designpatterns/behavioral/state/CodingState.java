package com.vas.training.designpatterns.behavioral.state;

public class CodingState implements SoftwareEngineerState {

	private final SoftwareEngineerStates state = SoftwareEngineerStates.CODING;
	private SoftwareEngineer softwareEngineer;

	public CodingState(SoftwareEngineer softwareEngineer) {
		super();
		this.softwareEngineer = softwareEngineer;
	}

	@Override
	public void startNextTask() {
		softwareEngineer.setState(new TestingState(softwareEngineer));
	}

	@Override
	public SoftwareEngineerStates getState() {
		return state;
	}

}
