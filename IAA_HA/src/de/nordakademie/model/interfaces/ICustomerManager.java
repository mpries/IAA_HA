package de.nordakademie.model.interfaces;

import de.nordakademie.model.Customer;

public interface ICustomerManager {

	public Customer view(int id);

	public void delete();

	public void create(Customer customer);

	public void edit();

}
