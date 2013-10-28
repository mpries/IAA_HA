package de.nordakademie.model.publication;

import java.util.List;

public class Publication {

	protected List<Author> authors;
	protected Keywords keywords;
	protected int stored;
	
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthor(List<Author> authors) {
		this.authors = authors;
	}
	public Keywords getKeyword() {
		return keywords;
	}
	public void setKeyword(Keywords keywords) {
		this.keywords = keywords;
	}
	public Integer getStored() {
		return stored;
	}
	public void setStored(Integer stored) {
		this.stored = stored;
	}
	
}
