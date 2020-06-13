package com.vas.training.designpatterns.behavioral.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DBMementoTest {

	@DisplayName("Restoring database should roll it back to state of the backupt")
	@Test
	void test() {
		Database db = new Database();
		db.createCollection("customers");
		db.addToCollection("customers", "Vinicius");
		db.addToCollection("customers", "Arthur");
		db.addToCollection("customers", "Marcus");
		DBMemento snapshot = db.createBackup();
		db.addToCollection("customers", "Gabriel");
		assertEquals(4, db.getCollectionSize("customers"));
		db.restoreFrom(snapshot);
		assertEquals(3, db.getCollectionSize("customers"));
	}

}
