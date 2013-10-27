package de.nordakademie.model.publication;

public class Publication {

	Author author;
	Keyword keyword;
	Library stored;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Keyword getKeyword() {
		return keyword;
	}
	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}
	public Library getStored() {
		return stored;
	}
	public void setStored(Library stored) {
		this.stored = stored;
	}
	
}
