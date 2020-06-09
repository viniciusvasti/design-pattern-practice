package com.vas.training.designpatterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vas.training.designpatterns.creational.prototype.Person.Gender;

class PersonPrototypeTest {

	@DisplayName("Cloning Person should create a new instance of Person")
	@Test
	void testClonePerson() throws CloneNotSupportedException {
		Person p1 = new Person("Jack", "Sparrow", LocalDate.now(), Gender.MALE);
		Person p2 = p1;
		assertTrue(p2 == p1);
		Person p3 = p1.clone();
		assertFalse(p3 == p1);
	}

}
