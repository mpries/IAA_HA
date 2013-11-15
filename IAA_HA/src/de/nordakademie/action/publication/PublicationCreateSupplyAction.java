package de.nordakademie.action.publication;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;

public class PublicationCreateSupplyAction extends ActionSupport implements Action {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6305775490423204120L;
	private IPublicationManager publicationManager;
	private List<Author> authors;
	private List<KindOfPublication> kindOfPublications;
	private List<Keyword> keywords;


	public String execute() {
		setAuthors(publicationManager.loadAllAuthors());
		setKindOfPublications(publicationManager.loadAllKinds());
		setKeywords(publicationManager.loadAllKeywords());
		return SUCCESS;
	}

	
	
	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
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
	
}
