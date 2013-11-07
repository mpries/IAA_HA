package de.nordakademie.model.publication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="AUTHOR")
public class Author {

	@Id
	protected Integer ID;
	protected String firstName;
	protected String lastName;
	
	public Author(Integer ID, String firstName, String lastName) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public void setID(Integer iD) {
		ID = iD;
	}
	
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
