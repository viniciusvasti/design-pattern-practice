package com.vas.training.designpatterns.structural.proxy;

public class ThirdPartyWebSite implements WebSite {

	String homePage = "Home.html";
	String aboutUsPage = "AboutUs.html";
	String LoginPage = "Login.html";

	public String getHomePage() {
		return homePage;
	}

	public String getAboutUsPage() {
		return aboutUsPage;
	}

	public String getLoginPage() {
		return LoginPage;
	}

}
