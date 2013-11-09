package de.nordakademie.model.publication;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class PublishedPublication extends Publication {

	protected String ISBN;
	@OneToOne
	protected Publisher publisher;
	
	public PublishedPublication(){
		this.authors = new ArrayList<Author>();
		this.keywords = new ArrayList<Keyword>();
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
