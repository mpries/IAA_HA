package de.nordakademie.model.interfaces;

import de.nordakademie.model.Customer;

public interface ICustomerManager {

	public Object view();

	public void delete();

	public Object create(Customer customer);

	public Object edit();

}
