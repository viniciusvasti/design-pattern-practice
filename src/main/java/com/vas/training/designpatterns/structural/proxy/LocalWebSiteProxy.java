package com.vas.training.designpatterns.structural.proxy;

public class LocalWebSiteProxy implements WebSite {

	private ThirdPartyWebSite thirdPartyWebSite = new ThirdPartyWebSite();

	String homePage = null;
	String aboutUsPage = null;
	String loginPage = null;

	@Override
	public String getHomePage() {
		if (homePage != null) {
			return homePage + " (cached)";
		}
		homePage = thirdPartyWebSite.getHomePage();
		return homePage;
	}

	@Override
	public String getAboutUsPage() {
		if (aboutUsPage != null) {
			return aboutUsPage + " (cached)";
		}
		aboutUsPage = thirdPartyWebSite.getAboutUsPage();
		return aboutUsPage;
	}

	@Override
	public String getLoginPage() {
		if (loginPage != null) {
			return loginPage + " (cached)";
		}
		loginPage = thirdPartyWebSite.getLoginPage();
		return loginPage;
	}

}
