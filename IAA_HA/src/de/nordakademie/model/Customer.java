package de.nordakademie.model;

import javax.persistence.Entity;

@Entity(name="CUSTOMER")
public class Customer {

	protected String firstName;
	protected String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
