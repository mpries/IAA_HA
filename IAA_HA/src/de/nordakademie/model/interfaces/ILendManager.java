package de.nordakademie.model.interfaces;

import java.util.Date;
import java.util.List;

import de.nordakademie.model.Customer;
import de.nordakademie.model.Lending;
import de.nordakademie.model.publication.Publication;

/**
 * 
 * @author Matthias Pries
 * @category Manager Interface:
 * 
 *           Dieses Interface wird vom LendManager implementiert und stellt alle
 *           benoetigten Mehtoden bereit
 * 
 */
public interface ILendManager {

	public void create(int customerId, int publicationId, Date currentDate,
			Date returnDate);

	public List<Publication> loadPublications();

	public List<Customer> loadCustomer();

	public List<Lending> loadLendingsWithWarning();

	public List<Lending> loadAll();

	public void registerReturn(int id);

	public void extendLending(int id);

	public Date createReturnDate();

	public boolean isCopyAvailable(int id);

	public String checkWarningStatus();

	public List<Lending> checkByCustomer(Customer customer);

	public boolean isPublicationOnLoan(Publication publication);

}
