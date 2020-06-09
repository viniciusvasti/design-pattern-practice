package com.vas.training.designpatterns.creational.singleton;

public enum WorldChampionEnum {

	INSTANCE;

	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
