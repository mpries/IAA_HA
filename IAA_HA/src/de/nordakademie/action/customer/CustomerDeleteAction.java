package de.nordakademie.action.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.IDeleteAction;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;

public class CustomerDeleteAction extends ActionSupport implements IDeleteAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3179689939121945974L;
	private Customer customer;
	private ICustomerManager customerManager;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ICustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(ICustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		customerManager.delete(customer);
		return SUCCESS;
	}
	
	public void validate(){
		// TODO
	}

}
