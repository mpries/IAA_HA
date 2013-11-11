package de.nordakademie.action.publication;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.IEditAction;

public class PublicationEditAction extends ActionSupport implements IEditAction, Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3036098533614635368L;
	private int id;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EDIT" + id);
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
