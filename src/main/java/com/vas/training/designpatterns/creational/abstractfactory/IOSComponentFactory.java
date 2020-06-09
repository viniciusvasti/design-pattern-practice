package com.vas.training.designpatterns.creational.abstractfactory;

import com.vas.training.designpatterns.creational.abstractfactory.products.Button;
import com.vas.training.designpatterns.creational.abstractfactory.products.IOSButton;
import com.vas.training.designpatterns.creational.abstractfactory.products.IOSInputText;
import com.vas.training.designpatterns.creational.abstractfactory.products.IOSSwitch;
import com.vas.training.designpatterns.creational.abstractfactory.products.InputText;
import com.vas.training.designpatterns.creational.abstractfactory.products.Switch;

public class IOSComponentFactory implements MobileComponentsFactory {

	@Override
	public Button createButton() {
		return new IOSButton();
	}

	@Override
	public InputText createInputText() {
		return new IOSInputText();
	}

	@Override
	public Switch createSwitch() {
		return new IOSSwitch();
	}

}
