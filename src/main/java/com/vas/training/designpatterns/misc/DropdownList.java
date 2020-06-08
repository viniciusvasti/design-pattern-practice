package com.vas.training.designpatterns.misc;

import java.util.List;

public class DropdownList {

	private List<DropdownListItem> items;

	public DropdownList(List<DropdownListItem> items) {
		this.items = items;
	}

	public void addItem(DropdownListItem item) {
		items.add(item);
	}

	public List<DropdownListItem> getItems() {
		return items;
	}

	public void list() {
		items.forEach(item -> System.out.println("Text: " + item.getText()));
	}

}
