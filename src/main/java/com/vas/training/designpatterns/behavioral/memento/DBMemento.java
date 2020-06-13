package com.vas.training.designpatterns.behavioral.memento;

import java.util.List;
import java.util.Map;

public class DBMemento {

	private Map<String, List<String>> db;

	public DBMemento(Map<String, List<String>> db) {
		super();
		this.db = db;
	}

	public Map<String, List<String>> getDb() {
		return db;
	}

}
