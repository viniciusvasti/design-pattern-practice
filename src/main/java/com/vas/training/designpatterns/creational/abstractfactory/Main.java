package com.vas.training.designpatterns.creational.abstractfactory;

public class Main {

	private static String os = "ios";

	public static void main(String[] args) {
		MobileApp mobileApp = null;
		if (getOS().equals("ios")) {
			mobileApp = new MobileApp(new IOSComponentFactory());
		}
		System.out.println(mobileApp.renderButton());
		System.out.println(mobileApp.renderInputText());
		System.out.println(mobileApp.renderSwitch());

		os = "android";
		if (getOS().equals("android")) {
			mobileApp = new MobileApp(new AndroidComponentFactory());
		}
		System.out.println(mobileApp.renderButton());
		System.out.println(mobileApp.renderInputText());
		System.out.println(mobileApp.renderSwitch());
	}

	private static String getOS() {
		return os;
	}

}
