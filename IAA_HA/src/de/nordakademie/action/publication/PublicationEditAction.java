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
		IEditAction, Action, SessionAware {

	/**
         *
         */
	private static final long serialVersionUID = -3036098533614635368L;

	private int id;
	private Publication publication;
	private IPublicationManager publicationManager;
	private Map<String, Object> session;
	private IKindOfPublicationManager kindManager;

	public IKindOfPublicationManager getKindManager() {
		return kindManager;
	}

	public void setKindManager(IKindOfPublicationManager kindManager) {
		this.kindManager = kindManager;
	}

	private List<KindOfPublication> kindOfPublications;

	private List<String> kind;

	public List<String> getKind() {
		return kind;
	}

	public void setKind(List<String> kind) {
		this.kind = kind;
	}

	public List<KindOfPublication> getKindOfPublications() {
		return kindOfPublications;
	}

	public void setKindOfPublications(List<KindOfPublication> kindOfPublications) {
		this.kindOfPublications = kindOfPublications;
	}

	@Override
	public String execute() throws Exception {
		publication = publicationManager.view(id);
		session.put("publicationEdit", publication);
		setKindOfPublications(publicationManager.loadAllKinds());
		return SUCCESS;
	}

	public String save() {

		publication.setAuthor(((Publication) session.get("publicationEdit"))
				.getAuthors());
		publication.setKeywords(((Publication) session.get("publicationEdit"))
				.getKeywords());
		publication.setKindOfPublication(new KindOfPublication(kind.get(0)));
		publicationManager.create(publication);
		return "save";
	}

	public String delete() {

		publicationManager.delete((Publication) session.get("publicationEdit"));
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}