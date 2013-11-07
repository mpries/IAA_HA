package de.nordakademie.action.customer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.Customer;
import de.nordakademie.model.Student;
import de.nordakademie.model.interfaces.ICustomerManager;

public class CustomerCreateAction extends ActionSupport implements ICreateAction, Action, ModelDriven<Customer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8222097196479424369L;
	private Customer customer = new Student();
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
		// TODO Auto-generated method stub
		customerManager.create(customer);
		return SUCCESS;
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

}
