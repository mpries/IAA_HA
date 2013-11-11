package de.nordakademie.model.publication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

	@Id 
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
