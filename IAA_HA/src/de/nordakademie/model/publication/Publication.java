package de.nordakademie.model.publication;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import de.nordakademie.model.enumaration.KindOfPublication;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Publication {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	protected String title;
	@OneToMany
	protected List<Author> authors;
	@ElementCollection
	protected List<Keyword> keywords;
	protected int stored;
	protected KindOfPublication kindOfPublication;

	public KindOfPublication getKindOfPublication() {
		return kindOfPublication;
	}

	public void setKindOfPublication(KindOfPublication kindOfPublication) {
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

}
