package de.nordakademie.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import de.nordakademie.model.util.User;

public class LoginValidationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7489354118148410616L;

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub

		Map<String, Object> sa = ai.getInvocationContext().getSession();
		User user = (User) sa.get("User");
		System.out.println("From Interceptor" + user.getUserName());
		
		ai.invoke();

		return "nothing";
	}

}
