package de.nordakademie.model.interfaces;

import java.util.List;

import de.nordakademie.model.Customer;
/**
 * 
 * @author Matthias Pries
 * @category Manager Interface:
 * 
 * Dieses Interface wird vom CustomerManager implementiert und stellt alle benoetigten Mehtoden bereit
 *
 */
public interface ICustomerManager {

	public Customer view(int id);

	public void delete(Customer customer);

	public void create(Customer customer);

	public void edit(Customer customer);

	public List<Customer> view();


	boolean isAlreadyAvailable(Customer customer);

	public boolean isCustomerAlreadyAvailable(Customer customer);

	public boolean isCustomerReferenced(Customer customer);

}
