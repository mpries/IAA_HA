package de.nordakademie.model.publication;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
/**
 * 
 * @author Timm Seguin
 *
 */
@Entity
public class PublishedPublication extends Publication {

	protected String ISBN;
	@ManyToOne
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
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
