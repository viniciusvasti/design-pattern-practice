package com.vas.training.designpatterns.creational.abstractfactory;

import com.vas.training.designpatterns.creational.abstractfactory.products.Button;
import com.vas.training.designpatterns.creational.abstractfactory.products.InputText;
import com.vas.training.designpatterns.creational.abstractfactory.products.Switch;

public interface MobileComponentsFactory {

	Button createButton();

	InputText createInputText();

	Switch createSwitch();

}
