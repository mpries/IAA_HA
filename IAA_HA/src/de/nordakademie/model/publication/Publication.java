package de.nordakademie.model.publication;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Publication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	protected String title;
	@ManyToMany
//	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@JoinColumn(name = "name")
	protected List<Author> authors;
	@ManyToMany
//	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@JoinColumn(name = "description")
	protected List<Keyword> keywords;
	protected int stored = 1;
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

	public void addKeyword(Keyword key) {
		this.keywords.add(key);
	}

	public void addAuthor(Author author) {
		this.authors.add(author);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public void setStored(int stored) {
		this.stored = stored;
	}

}
