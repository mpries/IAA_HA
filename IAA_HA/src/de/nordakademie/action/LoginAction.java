package de.nordakademie.action;

public class LoginAction {
	
	private String userId;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;

	}
	
	public String execute(){
		System.out.println("login Action");
		return"login";
	}

}
