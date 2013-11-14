package de.nordakademie.model.interfaces;

import java.util.Date;
import java.util.List;

import de.nordakademie.model.Customer;
import de.nordakademie.model.publication.Publication;

public interface ILendManager {

	public Object view();

	public void delete();

	public void create(int customerId, int publicationId, Date currentDate,
			Date returnDate);

	public Object edit();

	public List<Publication> loadPublications();

	public List<Customer> loadCustomer();

}
