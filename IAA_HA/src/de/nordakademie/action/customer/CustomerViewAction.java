package de.nordakademie.action.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import de.nordakademie.action.interfaces.IViewAction;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;

public class CustomerViewAction extends ActionSupport implements IViewAction, Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = 15072995864345116L;
	private int id;
	private ICustomerManager customerManager;
	private Customer customer;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		customer = customerManager.view(id);
		return SUCCESS;
	}

}
