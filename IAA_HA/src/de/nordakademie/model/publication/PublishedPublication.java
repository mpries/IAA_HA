package de.nordakademie.model.publication;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity(name="PUBLISHED_PUBLICATIONS")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class PublishedPublication extends Publication {

	protected String ISBN;
	@OneToOne
	protected Publisher publisher;
	
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
