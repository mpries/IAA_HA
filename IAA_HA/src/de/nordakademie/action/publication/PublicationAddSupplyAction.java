package de.nordakademie.action.publication;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

/**
 * @author Lukas Weikert 
 * Actionklasse füllt die Auswahlbox der existierenden
 * Publikationen, für die der Bestand erhöht werden kann
 */
public class PublicationAddSupplyAction extends ActionSupport implements
		Action, Preparable {

	private static final long serialVersionUID = 1L;
	private List<Publication> publications;
	private IPublicationManager publicationManager;

	public String execute() {
		return SUCCESS;
	}

	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	@Override
	public void prepare() throws Exception {
		setPublications(publicationManager.view());

	}

}
