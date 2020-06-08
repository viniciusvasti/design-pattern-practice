package com.vas.training.designpatterns.structural.bridge;

public class LoginPage implements Page {

	private Theme theme;

	public LoginPage(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String getContent() {
		return "I'm the Login Page with theme: " + theme.getMainColor();
	}

}
