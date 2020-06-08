package com.vas.training.designpatterns.structural.bridge;

public class Main {

	public static void main(String[] args) {
		Theme darkTheme = new DarkTheme();
		Theme lightTheme = new LightTheme();
		Page darkLoginPage = new LoginPage(darkTheme);
		Page lightLoginPage = new LoginPage(lightTheme);
		Page darkHomePage = new HomePage(darkTheme);
		Page lightHomePage = new HomePage(lightTheme);
		Page darkAboutUsPage = new AboutUsPage(darkTheme);
		Page lightAboutUsPage = new AboutUsPage(lightTheme);

		System.out.println(darkLoginPage.getContent());
		System.out.println(darkHomePage.getContent());
		System.out.println(darkAboutUsPage.getContent());
		System.out.println(lightLoginPage.getContent());
		System.out.println(lightHomePage.getContent());
		System.out.println(lightAboutUsPage.getContent());
	}

}
