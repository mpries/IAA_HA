package de.nordakademie.action.publication;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.IEditAction;
import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IKindOfPublicationManager;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

public class PublicationEditAction extends ActionSupport implements
		IEditAction, Action {

	/**
         *
         */
	private static final long serialVersionUID = -3036098533614635368L;

	private int id;
	private Publication publication;
	private IPublicationManager publicationManager;
	private IKindOfPublicationManager kindManager;
	private List<KindOfPublication> kindOfPublications;
	private String kind;

	public String save() {
		publication.setKindOfPublication(new KindOfPublication(kind));
		publicationManager.edit(publication);
		return "save";
	}

	public String delete() {
		if (publicationManager.isReferenced(publicationManager.view(id))) {
			addActionError("Das Buch ist gerade verliehen");
			return INPUT;

		}
		publicationManager.delete(publicationManager.view(id));
		return "delete";
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

	public IKindOfPublicationManager getKindManager() {
		return kindManager;
	}

	public void setKindManager(IKindOfPublicationManager kindManager) {
		this.kindManager = kindManager;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}