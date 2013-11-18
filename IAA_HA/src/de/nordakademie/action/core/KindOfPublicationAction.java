package de.nordakademie.action.core;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IKindOfPublicationManager;

/**
 * @author Lukas Weikert 
 * Actionklasse dient dem Verwalten der Publikationsarten
 */
public class KindOfPublicationAction extends ActionSupport implements Action {

	private static final long serialVersionUID = 5868853792903747455L;
	private IKindOfPublicationManager kindOfPublicationManager;
	private String searchKind;
	private KindOfPublication resultKind;
	private String editKind;
	private String addKind;

	public String add() {
		if (kindOfPublicationManager.isAlreadyAvailable(addKind)) {
			addFieldError("addKind", getText("kindOfPublicationAlreadyExists"));
			return INPUT;
		}
		kindOfPublicationManager.save(addKind);
		return "addKind";
	}

	public String search() {
		resultKind = kindOfPublicationManager.search(searchKind);
		return "search";
	}

	public String save() {
		if (kindOfPublicationManager.isReferneced(resultKind)) {
			addFieldError("editKind", getText("kindOfPublicationIsReferenced"));
			return INPUT;
		}
		kindOfPublicationManager.save(editKind);
		kindOfPublicationManager.delete(resultKind.getKind());
		return "save";
	}

	public String delete() {
		if (kindOfPublicationManager.isReferneced(resultKind)) {
			addFieldError("resultKind.kind", getText("kindOfPublicationIsReferenced"));
			return INPUT;
		}
		kindOfPublicationManager.delete(resultKind.getKind());
		return "delete";
	}

	public IKindOfPublicationManager getKindOfPublicationManager() {
		return kindOfPublicationManager;
	}

	public void setKindOfPublicationManager(
			IKindOfPublicationManager kindOfPublicationManager) {
		this.kindOfPublicationManager = kindOfPublicationManager;
	}

	public String getSearchKind() {
		return searchKind;
	}

	public void setSearchKind(String searchKind) {
		this.searchKind = searchKind;
	}

	public KindOfPublication getResultKind() {
		return resultKind;
	}

	public void setResultKind(KindOfPublication resultKind) {
		this.resultKind = resultKind;
	}

	public String getEditKind() {
		return editKind;
	}

	public void setEditKind(String editKind) {
		this.editKind = editKind;
	}

	public String getAddKind() {
		return addKind;
	}

	public void setAddKind(String addKind) {
		this.addKind = addKind;
	}

}
