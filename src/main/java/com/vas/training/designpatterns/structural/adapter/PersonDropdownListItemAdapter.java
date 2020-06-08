package com.vas.training.designpatterns.structural.adapter;

import com.vas.training.designpatterns.misc.DropdownListItem;
import com.vas.training.designpatterns.misc.Person;

public class PersonDropdownListItemAdapter implements DropdownListItem {

	Person person;

	public PersonDropdownListItemAdapter(Person person) {
		this.person = person;
	}

	@Override
	public String getText() {
		return person.getFirstName() + " " + person.getLastName();
	}

	@Override
	public Object getValue() {
		return person;
	}

}
