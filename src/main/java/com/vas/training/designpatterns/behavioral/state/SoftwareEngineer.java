package com.vas.training.designpatterns.behavioral.state;

public class SoftwareEngineer {

	private SoftwareEngineerState state;

	public SoftwareEngineer() {
		this.state = new SleepingState(this);
	}

	public void setState(SoftwareEngineerState state) {
		this.state = state;
	}

	public SoftwareEngineerStates getWhatHesDoing() {
		return state.getState();
	}

	public void doNextJobTask() {
		state.startNextTask();
	}

}
