package com.vas.training.designpatterns.behavioral.memento;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		db.createCollection("customers");
		db.addToCollection("customers", "Vinicius");
		db.addToCollection("customers", "Arthur");
		db.addToCollection("customers", "Marcus");
		DBMemento snapshot = db.createBackup();
		db.addToCollection("customers", "Gabriel");
		System.out.println(db.getWholeCollection("customers"));
		db.restoreFrom(snapshot);
		System.out.println(db.getWholeCollection("customers"));
	}

}
