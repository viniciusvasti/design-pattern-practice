package com.vas.training.designpatterns.structural.proxy;

public class Main {

	public static void main(String[] args) {
		Browser browser = new Browser(new LocalWebSiteProxy());
		System.out.println(browser.renderLoginPage());
		System.out.println(browser.renderHomePage());
		System.out.println(browser.renderAboutUsPage());
		System.out.println(browser.renderLoginPage());
		System.out.println(browser.renderHomePage());
		System.out.println(browser.renderAboutUsPage());
	}

}
