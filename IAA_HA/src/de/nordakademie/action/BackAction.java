package de.nordakademie.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Lukas Weikert
 *  Klasse verlinkt auf die Startseite
 */
public class BackAction extends ActionSupport implements Action {

	private static final long serialVersionUID = -3593166172010614505L;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
