package de.nordakademie.model.publication;

import javax.persistence.Entity;

@Entity(name="KEYWORDS")
public class Keyword {

	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}