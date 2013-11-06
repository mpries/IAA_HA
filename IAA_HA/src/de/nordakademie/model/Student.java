package de.nordakademie.model;

import javax.persistence.Entity;

@Entity(name="STUDENT")
public class Student extends Customer {

	protected Integer matriculationNumber;
	
	
	
	public Student(String firstName, String lastName,
			Integer matriculationNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.matriculationNumber = matriculationNumber;
	}

	public Integer getMatriculationNumber() {
		return matriculationNumber;
	}

	
}
