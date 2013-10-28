package de.nordakademie.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginValidationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7489354118148410616L;

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Befor invoke");
		ai.invoke();
		Map params = ActionContext.getContext().getParameters();
		System.out.println("After invoke");
		return "nothing";
	}

}
