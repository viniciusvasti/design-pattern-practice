package com.vas.training.designpatterns.behavioral.state;

public class AnalyzingBacklogFeatureState implements SoftwareEngineerState {

	private final SoftwareEngineerStates state = SoftwareEngineerStates.ANALYZING_BACKLOG_FEATURE;
	private SoftwareEngineer softwareEngineer;

	public AnalyzingBacklogFeatureState(SoftwareEngineer softwareEngineer) {
		super();
		this.softwareEngineer = softwareEngineer;
	}

	@Override
	public void startNextTask() {
		softwareEngineer.setState(new CodingState(softwareEngineer));
	}

	@Override
	public SoftwareEngineerStates getState() {
		return state;
	}

}
