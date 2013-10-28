package de.nordakademie.model.publication;

public abstract class PublishedPublication extends Publication {

	protected String ISBN;
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
