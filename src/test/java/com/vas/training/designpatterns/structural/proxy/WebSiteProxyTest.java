package com.vas.training.designpatterns.structural.proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WebSiteProxyTest {

	@DisplayName("If a page is cached, the cached page should be returned")
	@Test
	void test() {
		Browser browser = new Browser(new LocalWebSiteProxy());
		assertEquals("Login.html", browser.renderLoginPage());
		assertEquals("Home.html", browser.renderHomePage());
		assertEquals("AboutUs.html", browser.renderAboutUsPage());
		assertEquals("Login.html (cached)", browser.renderLoginPage());
		assertEquals("Home.html (cached)", browser.renderHomePage());
		assertEquals("AboutUs.html (cached)", browser.renderAboutUsPage());
	}

}
