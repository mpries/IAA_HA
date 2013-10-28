package de.nordakademie.model.publication;

import java.util.List;

public class Library {

	protected String name;
	protected List<Publication> publications;
	
	public Library(String name, List<Publication> publications) {
		this.name = name;
		this.publications = publications;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Publication> getPublications() {
		return publications;
	}
	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}
	
		
}
