package de.nordakademie.action.publication;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.IViewAction;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

public class PublicationViewAction extends ActionSupport implements
		IViewAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5414881176977209333L;

	private IPublicationManager publicationManager;
	private String title;
	private String author;
	private String keyword;
	private List<Publication> publications;
	private List<String> searchList = new ArrayList<String>();

	public List<String> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<String> searchList) {
		this.searchList = searchList;
	}

	public String execute() {
		searchList.add(title);
		searchList.add(author);
		searchList.add(keyword);
		publications = publicationManager.view(title, author, keyword);
		return SUCCESS;
	}

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Publication> getPublication() {
		return publications;
	}

	public void setPublication(List<Publication> publications) {
		this.publications = publications;
	}

}
