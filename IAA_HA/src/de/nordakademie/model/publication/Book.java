package de.nordakademie.model.publication;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Book extends PublishedPublication {

	public Book(List<Author> authors, List<Keyword> keywords, int stored, String ISBN, Publisher publisher) {
		this.authors = authors;
		this.keywords = keywords;
		this.stored = stored;
		this.ISBN = ISBN;
		this.publisher = publisher;
	}

}
