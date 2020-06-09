package com.vas.training.designpatterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MobileAppAbstractFactoryTest {

	@DisplayName("IOS should render its own native IOS components")
	@Test
	void testIOSMobileApp() {
		MobileApp mobileApp = null;
		mobileApp = new MobileApp(new IOSComponentFactory());
		assertEquals("Rendering IOS Button", mobileApp.renderButton());
		assertEquals("Rendering IOS Input Text", mobileApp.renderInputText());
		assertEquals("Rendering IOS Switch", mobileApp.renderSwitch());
	}

	@DisplayName("Android should render its own native Android components")
	@Test
	void testAndroidMobileApp() {
		MobileApp mobileApp = null;
		mobileApp = new MobileApp(new AndroidComponentFactory());
		assertEquals("Rendering Android Button", mobileApp.renderButton());
		assertEquals("Rendering Android Input Text", mobileApp.renderInputText());
		assertEquals("Rendering Android Switch", mobileApp.renderSwitch());
	}

}
