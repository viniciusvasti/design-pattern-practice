package com.vas.training.designpatterns.behavioral.state;

public class StudyingState implements SoftwareEngineerState {

	private final SoftwareEngineerStates state = SoftwareEngineerStates.STUDYING;
	private SoftwareEngineer softwareEngineer;

	public StudyingState(SoftwareEngineer softwareEngineer) {
		super();
		this.softwareEngineer = softwareEngineer;
	}

	@Override
	public void startNextTask() {
		softwareEngineer.setState(new SleepingState(softwareEngineer));
	}

	@Override
	public SoftwareEngineerStates getState() {
		return state;
	}

}
