package de.nordakademie.action.publication;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;
import de.nordakademie.model.publication.PublishedPublication;
import de.nordakademie.model.publication.Publisher;

public class PublicationCreateAction extends ActionSupport implements
		ICreateAction, Action, SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5738244878962689934L;
	private PublishedPublication publication;
	private Keyword keyword;
	private Author author;
	private Publisher publisher;
	private IPublicationManager publicationManager;
	private Map<String, Object> session;

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("EXECUTE" + publication.getTitle());
		session.put("publication", publication);
		return SUCCESS;
	}
	
	public String addKeyword(){
		publication = (PublishedPublication) session.get("publication");
		publication.addKeyword(keyword);
		return "addKeyword";
	}
	
	public String saveKeyword(){
		return "saveKeyword";
	}
	
	public String saveAuthor(){
		System.out.println("SAVE");
		publication = (PublishedPublication) session.get("publication");
		System.out.println(publication.getISBN());
		System.out.println(publication.getPublisher().getName());
		publicationManager.create(publication);
		return "saveAuthor";
	}
	
	public String addAuthor(){
		publication = (PublishedPublication) session.get("publication");
		publication.addAuthor(author);
		return "addAuthor";
	}

	public PublishedPublication getPublication() {
		return publication;
	}

	public void setPublication(PublishedPublication publication) {
		this.publication = publication;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	public Keyword getKeyword() {
		return keyword;
	}

	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
