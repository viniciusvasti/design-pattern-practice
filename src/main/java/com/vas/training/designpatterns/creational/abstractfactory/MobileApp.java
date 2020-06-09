package com.vas.training.designpatterns.creational.abstractfactory;

import com.vas.training.designpatterns.creational.abstractfactory.products.Button;
import com.vas.training.designpatterns.creational.abstractfactory.products.InputText;
import com.vas.training.designpatterns.creational.abstractfactory.products.Switch;

public class MobileApp {

	private MobileComponentsFactory componentsFactory;

	public MobileApp(MobileComponentsFactory componentsFactory) {
		super();
		this.componentsFactory = componentsFactory;
	}

	public String renderButton() {
		Button button = componentsFactory.createButton();
		return button.render();
	}

	public String renderInputText() {
		InputText inputText = componentsFactory.createInputText();
		return inputText.render();
	}

	public String renderSwitch() {
		Switch switch1 = componentsFactory.createSwitch();
		return switch1.render();
	}

}
