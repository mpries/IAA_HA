package de.nordakademie.model.interfaces;

import java.util.List;

import de.nordakademie.model.Customer;

public interface ICustomerManager {

	public Customer view(int id);

	public void delete(Customer customer);

	public void create(Customer customer);

	public void edit(Customer customer);

	public List<Customer> view();

}
