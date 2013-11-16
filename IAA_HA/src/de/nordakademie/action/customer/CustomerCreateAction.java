package de.nordakademie.action.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;

public class CustomerCreateAction extends ActionSupport implements
		ICreateAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8222097196479424369L;
	private Customer customer;
	private ICustomerManager customerManager;

	public ICustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(ICustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String execute() throws Exception {
		customerManager.create(customer);
		return SUCCESS;
	}
	
	public void validate(){
		if(customerManager.isAlreadyAvailable(customer)){
			addFieldError("customer.customerId", getText("validateCustomerIdAlreadyExist"));
		}
	}

}
