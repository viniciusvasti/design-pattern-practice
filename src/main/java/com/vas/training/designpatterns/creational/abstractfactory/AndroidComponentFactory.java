package com.vas.training.designpatterns.creational.abstractfactory;

import com.vas.training.designpatterns.creational.abstractfactory.products.AndroidButton;
import com.vas.training.designpatterns.creational.abstractfactory.products.AndroidInputText;
import com.vas.training.designpatterns.creational.abstractfactory.products.AndroidSwitch;
import com.vas.training.designpatterns.creational.abstractfactory.products.Button;
import com.vas.training.designpatterns.creational.abstractfactory.products.InputText;
import com.vas.training.designpatterns.creational.abstractfactory.products.Switch;

public class AndroidComponentFactory implements MobileComponentsFactory {

	@Override
	public Button createButton() {
		return new AndroidButton();
	}

	@Override
	public InputText createInputText() {
		return new AndroidInputText();
	}

	@Override
	public Switch createSwitch() {
		return new AndroidSwitch();
	}

}
