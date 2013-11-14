package de.nordakademie.action.publication;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;
import de.nordakademie.model.publication.PublishedPublication;

public class PublicationCreateAction extends ActionSupport implements
		ICreateAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5738244878962689934L;
	private List<Author> authors;
	private List<KindOfPublication> kindOfPublications;
	private List<Keyword> keywords;
	private IPublicationManager publicationManager;
	private PublishedPublication publication;
	private List<String> kind;
	private List<String> name;
	private List<String> description;

	public String supply() {
		setAuthors(publicationManager.loadAllAuthors());
		setKindOfPublications(publicationManager.loadAllKinds());
		setKeywords(publicationManager.loadAllKeywords());
		return "supply";
	}

	public String execute() {
		publicationManager.create(publication, name, kind.get(0).toString(), description);
		return "save";
	}
	
	public void validate(){
		System.out.println("*********VALIDATE***********");
		addFieldError("publication.ISBN", "ERROR OCCURED");
	}
	
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<KindOfPublication> getKindOfPublications() {
		return kindOfPublications;
	}

	public void setKindOfPublications(List<KindOfPublication> kindOfPublications) {
		this.kindOfPublications = kindOfPublications;
	}

	public List<Keyword> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	public PublishedPublication getPublication() {
		return publication;
	}

	public void setPublication(PublishedPublication publication) {
		this.publication = publication;
	}

	public List<String> getKind() {
		return kind;
	}

	public void setKind(List<String> kind) {
		this.kind = kind;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}




}
