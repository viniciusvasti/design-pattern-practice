package com.vas.training.designpatterns.structural.bridge;

public class AboutUsPage implements Page {

	private Theme theme;

	public AboutUsPage(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String getContent() {
		return "I'm the About Us Page with theme: " + theme.getMainColor();
	}

}
