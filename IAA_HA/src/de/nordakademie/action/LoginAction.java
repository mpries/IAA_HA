package de.nordakademie.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import de.nordakademie.model.util.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3462871056098726951L;
	private User user = new User();
	private Map<String, Object> sessionAttributes;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute(){
		System.out.println("login Action Username: " + user.getUserName());
		return"success";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
		
	}

}
