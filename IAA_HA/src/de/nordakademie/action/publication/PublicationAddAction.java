package de.nordakademie.action.publication;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.model.interfaces.IPublicationManager;

/**
 * @author Lukas Weikert
 * Actionklasse dient dem Erhöhen des Bibliotheksbestandes einer Publikation
 */
public class PublicationAddAction extends ActionSupport implements Action {

	private static final long serialVersionUID = -5587065415280173634L;
	private int id;
	private int amount;
	private IPublicationManager publicationManager;


	
	public String execute(){
		publicationManager.addCopy(id, amount);
		return SUCCESS;
	}

	public void validate(){
		if (amount > 1000000){
			addFieldError("amount", getText("validationLess1mio"));
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

}
