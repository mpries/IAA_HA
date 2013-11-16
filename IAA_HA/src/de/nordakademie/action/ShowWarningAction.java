package de.nordakademie.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.Lending;
import de.nordakademie.model.interfaces.ILendManager;

public class ShowWarningAction extends ActionSupport implements Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5034946870329517035L;
	private ILendManager lendManager;
	private List<Lending> lendingsWithWarning;
	
	
	public String execute(){
		lendManager.checkWarningStatus();
		setLendingsWithWarning(lendManager.loadLendingsWithWarning());
		return SUCCESS;
	}


	public ILendManager getLendManager() {
		return lendManager;
	}


	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}


	public List<Lending> getLendingsWithWarning() {
		return lendingsWithWarning;
	}


	public void setLendingsWithWarning(List<Lending> lendingsWithWarning) {
		this.lendingsWithWarning = lendingsWithWarning;
	}




}
