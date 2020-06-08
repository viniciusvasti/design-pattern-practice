package com.vas.training.designpatterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vas.training.designpatterns.misc.DropdownList;
import com.vas.training.designpatterns.misc.DropdownListItem;
import com.vas.training.designpatterns.misc.Person;
import com.vas.training.designpatterns.misc.Person.Gender;

class PersonDropdownListItemAdapterTest {

	@DisplayName("Should be ok use de Adapter to create a DropdownList for Persons")
	@Test
	void CreateDropdownList_ForPersonsList() {
		Person p1 = new Person("Jack", "Sparrow", LocalDate.now(), Gender.MALE);
		Person p2 = new Person("Jon", "Snow", LocalDate.now(), Gender.MALE);
		Person p3 = new Person("Sara", "Connor", LocalDate.now(), Gender.FEMALE);
		List<DropdownListItem> items = new ArrayList<>();
		items.add(new PersonDropdownListItemAdapter(p1));
		items.add(new PersonDropdownListItemAdapter(p2));
		items.add(new PersonDropdownListItemAdapter(p3));
		DropdownList dropdownList = new DropdownList(items);
		dropdownList.list();
		assertEquals(items.size(), dropdownList.getItems().size());
		assertEquals(p1.getFirstName() + " " + p1.getLastName(),
				dropdownList.getItems().get(0).getText());
		assertEquals(p2.getFirstName() + " " + p2.getLastName(),
				dropdownList.getItems().get(1).getText());
		assertEquals(p3.getFirstName() + " " + p3.getLastName(),
				dropdownList.getItems().get(2).getText());
	}

}
