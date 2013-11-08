package de.nordakademie.action.publication;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.enumaration.KindOfPublication;
import de.nordakademie.model.publication.Publication;
import de.nordakademie.model.publication.PublishedPublication;

public class PublicationCreateAction extends ActionSupport implements
		ICreateAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5738244878962689934L;
	private Publication publication = new PublishedPublication();

	@Override
	public String execute() throws Exception {
		return null;
	}

	public void validate() {
		// TODO Alles ueberpruefen was nicht in der xml machbar ist

	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

}
