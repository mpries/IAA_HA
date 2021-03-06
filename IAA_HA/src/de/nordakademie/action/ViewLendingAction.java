package de.nordakademie.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.Lending;
import de.nordakademie.model.interfaces.ILendManager;

/**
 * @author Lukas Weikert
 * Actionklasse zeigt die �bersicht der offenen Ausleihvorg�nge und bietet 
 * die M�glichkeit einen Ausleihvorgang zu verl�ngern oder die R�ckgabe zu
 * erfassen
 */
public class ViewLendingAction extends ActionSupport implements Action {

	private static final long serialVersionUID = 7499207531537708725L;
	private ILendManager lendManager;
	private List<Lending> lendings;
	private int id;

	public String supply() {
		setLendings(lendManager.loadAll());
		return "supply";
	}

	/**
	 * Erfassen der R�ckgabe
	 */
	public String returnPublication() {
		lendManager.registerReturn(id);
		setLendings(lendManager.loadAll());
		return "return";
	}

	/**
	 * Verl�ngern eines Ausleihvorgangs
	 */
	public String extend() {
		lendManager.extendLending(id);
		setLendings(lendManager.loadAll());
		return "extend";
	}

	public ILendManager getLendManager() {
		return lendManager;
	}

	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

	public List<Lending> getLendings() {
		return lendings;
	}

	public void setLendings(List<Lending> lendings) {
		this.lendings = lendings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
