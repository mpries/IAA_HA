package de.nordakademie.model.manager;

import de.nordakademie.dao.CustomerDAO;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;

public class CustomerManager implements ICustomerManager {
	
	private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public Customer view(int id) {
		// TODO Auto-generated method stub
		return customerDAO.load(id);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.save(customer);

	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub

	}

}
