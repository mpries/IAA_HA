package de.nordakademie.action.publication;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

public class PublicationEditSupply extends ActionSupport implements Action, Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6574853966128240149L;
	private int id;
	private IPublicationManager publicationManager;
	private Publication publication;
	private List<KindOfPublication> kindOfPublications;
	

	public String execute(){
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		publication = publicationManager.view(id);
		setKindOfPublications(publicationManager.loadAllKinds());
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public List<KindOfPublication> getKindOfPublications() {
		return kindOfPublications;
	}

	public void setKindOfPublications(List<KindOfPublication> kindOfPublications) {
		this.kindOfPublications = kindOfPublications;
	}

}
