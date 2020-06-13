package com.vas.training.designpatterns.behavioral.state;

public interface SoftwareEngineerState {

	void startNextTask();

	SoftwareEngineerStates getState();

}
