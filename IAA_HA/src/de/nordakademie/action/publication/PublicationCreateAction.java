package de.nordakademie.action.publication;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.PublishedPublication;

public class PublicationCreateAction extends ActionSupport implements
		ICreateAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5738244878962689934L;
	private IPublicationManager publicationManager;
	private PublishedPublication publication;
	private List<String> kind;
	private List<String> name;
	private List<String> description;

	public String execute() {
		publicationManager.create(publication, name, kind.get(0).toString(),
				description);
		return SUCCESS;
	}

	public void validate() {
		if(publicationManager.isISBNAlreadyAvailable(publication)){
			addFieldError("publication.ISBN", "ISBN exisitert bereits");
		}
		if(publicationManager.isDateGreaterThanToday(publication)){
			addFieldError("publication.releaseDate", "Datum liegt in der Zukunft");
		}

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
