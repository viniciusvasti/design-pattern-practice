package com.vas.training.designpatterns.behavioral.state;

public class SleepingState implements SoftwareEngineerState {

	private final SoftwareEngineerStates state = SoftwareEngineerStates.SLEEPING;
	private SoftwareEngineer softwareEngineer;

	public SleepingState(SoftwareEngineer softwareEngineer) {
		super();
		this.softwareEngineer = softwareEngineer;
	}

	@Override
	public void startNextTask() {
		softwareEngineer.setState(new AnalyzingBacklogFeatureState(softwareEngineer));
	}

	@Override
	public SoftwareEngineerStates getState() {
		return state;
	}

}
