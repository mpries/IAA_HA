package de.nordakademie.action.publication.academic;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.AcademicPublication;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;

public class APublicationCreateAction extends ActionSupport implements
		ICreateAction, Action, Preparable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2553061368345033580L;
	private List<Author> authors;
	private List<KindOfPublication> kindOfPublications;
	private List<Keyword> keywords;
	private IPublicationManager publicationManager;
	private AcademicPublication publication;
	private List<String> kind;
	private List<String> name;
	private List<String> description;

	public String supply() {
		setAuthors(publicationManager.loadAllAuthors());
		setKindOfPublications(publicationManager.loadAllKinds());
		setKeywords(publicationManager.loadAllKeywords());
		return "supply";
	}

	public String save() {
		publicationManager.create(publication, name, kind.get(0).toString(), description);
		return "save";
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
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

	public List<KindOfPublication> getKindOfPublications() {
		return kindOfPublications;
	}

	public void setKindOfPublications(List<KindOfPublication> kindOfPublications) {
		this.kindOfPublications = kindOfPublications;
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

	public List<String> getKind() {
		return kind;
	}

	public void setKind(List<String> kind) {
		this.kind = kind;
	}
	
	public AcademicPublication getPublication() {
		return publication;
	}

	public void setPublication(AcademicPublication publication) {
		this.publication = publication;
	}

	@Override
	public void prepare() throws Exception {
		setAuthors(publicationManager.loadAllAuthors());
		setKindOfPublications(publicationManager.loadAllKinds());
		setKeywords(publicationManager.loadAllKeywords());
		
	}

}
