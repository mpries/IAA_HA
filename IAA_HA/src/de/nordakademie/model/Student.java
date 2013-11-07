package de.nordakademie.model;

import javax.persistence.Entity;

@Entity(name = "STUDENT")
public class Student extends Customer {

	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;

	}

}
