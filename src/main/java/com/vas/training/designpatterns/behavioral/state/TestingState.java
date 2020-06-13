package com.vas.training.designpatterns.behavioral.state;

public class TestingState implements SoftwareEngineerState {

	private final SoftwareEngineerStates state = SoftwareEngineerStates.TESTING;
	private SoftwareEngineer softwareEngineer;

	public TestingState(SoftwareEngineer softwareEngineer) {
		super();
		this.softwareEngineer = softwareEngineer;
	}

	@Override
	public void startNextTask() {
		softwareEngineer.setState(new StudyingState(softwareEngineer));
	}

	@Override
	public SoftwareEngineerStates getState() {
		return state;
	}

}
