package de.nordakademie.model.publication;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Keyword {

	@Id
	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
