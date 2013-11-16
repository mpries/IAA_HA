package de.nordakademie.model.manager;

import java.util.List;

import de.nordakademie.dao.CustomerDAO;
import de.nordakademie.model.Customer;
import de.nordakademie.model.interfaces.ICustomerManager;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.model.interfaces.IPublicationManager;

public class CustomerManager implements ICustomerManager {

	private CustomerDAO customerDAO;
	private ILendManager lendManager;

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
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.delete(customer);

	}

	@Override
	public void create(Customer customer) {
		customerDAO.save(customer);

	}

	@Override
	public void edit(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.edit(customer);
	}

	@Override
	public List<Customer> view() {
		return customerDAO.loadAll();
	}

	@Override
	public boolean isAlreadyAvailable(Customer customer) {
		if (customerDAO.load(customer.getCustomerId()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isCustomerAlreadyAvailable(Customer customer) {
		if(this.view(customer.getCustomerId()) == null){
			return false;
		}
		return true;
	}

	@Override
	public boolean isCustomerReferenced(Customer customer) {
		if(lendManager.checkByCustomer(customer).isEmpty()){
			return false;
		}
		return true;
	}

	public ILendManager getLendManager() {
		return lendManager;
	}

	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

}
