package de.nordakademie.action.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.IDeleteAction;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;

/**
  * @author Lukas Weikert
  * Klasse dient dem L�schen eines Autors
 */
public class CustomerDeleteAction extends ActionSupport implements
		IDeleteAction, Action {

	private static final long serialVersionUID = 3179689939121945974L;
	private Customer customer;
	private ICustomerManager customerManager;

	@Override
	public String execute() throws Exception {
		customerManager.delete(customer);
		return SUCCESS;
	}

	public void validate() {
		if (customerManager.isCustomerReferenced(customer)) {
			addFieldError("customer.firstName", "Kann nicht geloescht werden");
		}
	}

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

}
