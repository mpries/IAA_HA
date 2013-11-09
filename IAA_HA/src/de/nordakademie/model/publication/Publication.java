package de.nordakademie.model.publication;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Publication {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	protected String title;
	@OneToMany
	protected List<Author> authors;
	@OneToMany
	protected List<Keyword> keywords;
	protected int stored;
	protected String kindOfPublication;
	protected Date releaseDate;

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getKindOfPublication() {
		return kindOfPublication;
	}

	public void setKindOfPublication(String kindOfPublication) {
		this.kindOfPublication = kindOfPublication;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthor(List<Author> authors) {
		this.authors = authors;
	}

	public List<Keyword> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}

	public Integer getStored() {
		return stored;
	}

	public void setStored(Integer stored) {
		this.stored = stored;
	}
	
	public void addKeyword(Keyword key){
		this.keywords.add(key);
	}
	
	public void addAuthor(Author author){
		this.authors.add(author);
	}

}
