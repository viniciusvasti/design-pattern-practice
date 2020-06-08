package com.vas.training.designpatterns.structural.bridge;

public class HomePage implements Page {

	private Theme theme;

	public HomePage(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String getContent() {
		return "I'm the Home Page with theme: " + theme.getMainColor();
	}

}
