package de.nordakademie.model.publication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publisher {

	@Id
	protected String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
