package de.nordakademie.model.publication;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class AcademicPublication extends Publication {
	
	public AcademicPublication(){
		this.authors = new ArrayList<Author>();
		this.keywords = new ArrayList<Keyword>();
	}

}
