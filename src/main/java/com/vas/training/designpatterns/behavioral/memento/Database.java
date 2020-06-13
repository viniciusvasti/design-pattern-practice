package com.vas.training.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

	private Map<String, List<String>> db = new HashMap<>();

	public void createCollection(String collectionName) {
		db.put(collectionName, new ArrayList<>());
	}

	public void addToCollection(String collectionName, String value) {
		db.get(collectionName).add(value);
	}

	public String getWholeCollection(String collectionName) {
		return db.get(collectionName).toString();
	}

	public int getCollectionSize(String collectionName) {
		return db.get(collectionName).size();
	}

	public DBMemento createBackup() {
		Map<String, List<String>> dbBackup = new HashMap<>();
		for (Map.Entry<String, List<String>> collection : db.entrySet()) {
			List<String> values = new ArrayList<>(collection.getValue());
			dbBackup.put(collection.getKey(), values);
		}
		return new DBMemento(dbBackup);
	}

	public void restoreFrom(DBMemento snapshot) {
		db = snapshot.getDb();
	}

}
