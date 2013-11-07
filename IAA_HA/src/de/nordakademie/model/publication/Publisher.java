package de.nordakademie.model.publication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PUBLISHER")
public class Publisher {

	@Id
	protected String name;
	
	public Publisher(String name) {
		this.name = name;
	}

}
