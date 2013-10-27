package de.nordakademie.model.publication;

import java.util.List;

public class Magazine extends PublishedPublication {

	public Magazine(List<Author> authors, Keywords keywords, Integer stored, String ISBN, Publisher publisher) {
		this.authors = authors;
		this.keywords = keywords;
		this.stored = stored;
		this.ISBN = ISBN;
		this.publisher = publisher;
	}
	
}
