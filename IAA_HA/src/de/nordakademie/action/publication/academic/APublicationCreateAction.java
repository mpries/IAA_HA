package de.nordakademie.action.publication.academic;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;
import de.nordakademie.model.publication.AcademicPublication;
import de.nordakademie.model.publication.Publisher;

public class APublicationCreateAction extends ActionSupport implements
		ICreateAction, Action, SessionAware {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8722542494454836978L;
	private AcademicPublication publication;
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
		session.put("publication", publication);
		return SUCCESS;
	}
	
	public String addKeyword(){
		publication = (AcademicPublication) session.get("publication");
		publication.addKeyword(keyword);
		return "addKeyword";
	}
	
	public String saveKeyword(){
		return "saveKeyword";
	}
	
	public String saveAuthor(){
		publication = (AcademicPublication) session.get("publication");
		publicationManager.create(publication);
		return "saveAuthor";
	}
	
	public String addAuthor(){
		publication = (AcademicPublication) session.get("publication");
		publication.addAuthor(author);
		return "addAuthor";
	}

	public AcademicPublication getPublication() {
		return publication;
	}

	public void setPublication(AcademicPublication publication) {
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
