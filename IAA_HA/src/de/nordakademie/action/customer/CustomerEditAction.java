package de.nordakademie.action.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.action.interfaces.IEditAction;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;

/**
 * @author Lukas Weikert
 * Klasse dient dem �ndern der Daten einer Klasse
 */
public class CustomerEditAction extends ActionSupport implements IEditAction,
		Action {

	private static final long serialVersionUID = -6748687070655197621L;
	private Customer customer;
	private ICustomerManager customerManager;

	@Override
	public String execute() throws Exception {
		customerManager.edit(customer);
		return SUCCESS;
	}

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

}
