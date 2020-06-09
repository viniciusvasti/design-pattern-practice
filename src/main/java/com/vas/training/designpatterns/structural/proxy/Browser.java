package com.vas.training.designpatterns.structural.proxy;

public class Browser {

	private WebSite webSite;

	public Browser(LocalWebSiteProxy webSite) {
		super();
		this.webSite = webSite;
	}

	public String renderLoginPage() {
		return webSite.getLoginPage();
	}

	public String renderHomePage() {
		return webSite.getHomePage();
	}

	public String renderAboutUsPage() {
		return webSite.getAboutUsPage();
	}

}
