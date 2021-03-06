package de.nordakademie.model.manager;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import de.nordakademie.dao.LendDAO;
import de.nordakademie.model.Customer;
import de.nordakademie.model.Lending;
import de.nordakademie.model.Warning;
import de.nordakademie.model.interfaces.ICustomerManager;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

/**
 * 
 * @author Matthias Pries
 * @category Manager Class:
 * 
 *           Diese Klasse implementiert die Logik fuer das Model Lending
 * 
 */
public class LendManager implements ILendManager {

	private static final long sevenDaysInMiliSec = 604800000;
	private static final int SEVENDAYS = 7;
	private static final int PREASENSBESTAND = 2;
	private LendDAO lendDAO;
	private IPublicationManager publicationManager;
	private ICustomerManager customerManager;
	private Lending lend;

	

	public Date createReturnDate() {
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DATE, 14);
		Date returnDate = c.getTime();
		return returnDate;
	}

	@Override
	public List<Publication> loadPublications() {
		return publicationManager.view();
	}

	@Override
	public List<Customer> loadCustomer() {
		return customerManager.view();
	}

	@Override
	public void create(int customerId, int publicationId, Date currentDate,
			Date returnDate) {
		lend = new Lending();
		lend.setLoanDate(currentDate);
		lend.setReturnDate(returnDate);
		lend.setCustomer(customerManager.view(customerId));
		lend.setPublication(publicationManager.view(publicationId));
		lendDAO.create(lend);
		publicationManager.decreaseStored(publicationManager
				.view(publicationId));
	}

	@Override
	public List<Lending> loadLendingsWithWarning() {
		return lendDAO.loadLendingsWithWarning();
	}

	@Override
	public List<Lending> loadAll() {
		return lendDAO.loadAll();
	}

	@Override
	public void registerReturn(int id) {
		publicationManager.increaseStored(lendDAO.loadById(id).getPublication()
				.getId());
		lendDAO.delete(id);

	}

	/**
	 * 
	 * Verlaengert ein Ausleihvorgang, unter beruecksichtigung wie oft dieser
	 * gemahnt wurde
	 */
	@Override
	public void extendLending(int id) {
		Lending lend = lendDAO.loadById(id);
		Warning w = lend.getWarning();
		if (lend.getExtensions() < 2) {
			w.setAmount(0);
			lend.setWarning(w);
			lend.setExtensions(lend.getExtensions() + 1);
			if (!this.isAlreadyWarned(lend.getWarning().getId())) {
				lend.setReturnDate(extendReturnDate(lend.getReturnDate()));
			} else {
				lend.setReturnDate(extendReturnDate(new Date()));
				this.delteWarnings(lend);
			}
			lendDAO.create(lend);

		}

	}

	public void delteWarnings(Lending lend) {
		lendDAO.setWarningToZero(lend.getWarning().getId());

	}

	public boolean isAlreadyWarned(int id) {
		if (lendDAO.loadWarningById(id).getAmount() > 0) {
			return true;
		}
		return false;
	}

	private Date extendReturnDate(Date returnDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(returnDate);
		c.add(Calendar.DATE, SEVENDAYS);
		Date extendReturnDate = c.getTime();
		return extendReturnDate;
	}

	@Override
	public boolean isCopyAvailable(int id) {
		Publication publication = publicationManager.view(id);
		if (publication.getStored() < PREASENSBESTAND) {
			return false;
		}
		return true;
	}

	@Override
	public String checkWarningStatus() {
		List<Lending> lendingsWithWarning = lendDAO.loadWithExpiredDate();
		for (Lending lending : lendingsWithWarning) {
			calculateAmountOfWarning(lending);
		}

		return null;

	}

	/**
	 * 
	 * @param Lending
	 * 
	 *            Berechnet die Anzahl der Mahnungen anhand von des
	 *            Ausleihvorgangs.
	 */
	private void calculateAmountOfWarning(Lending lending) {
		long diff = new Date().getTime() - lending.getReturnDate().getTime();
		if (diff > sevenDaysInMiliSec * 4) {
			System.out.println("CASE 1");
			// Decrease Copy or delete publication if necessary
			lendDAO.delete(lending.getId());
			publicationManager.decreaseStored(lending.getPublication());
		}
		if (diff > sevenDaysInMiliSec * 3) {
			System.out.println("CASE 2");
			lendDAO.increaseWarningAmount(lending, 3);
		}
		if (diff > sevenDaysInMiliSec * 2) {
			System.out.println("CASE 3");
			lendDAO.increaseWarningAmount(lending, 2);
		}
		if (diff < sevenDaysInMiliSec) {
			System.out.println("CASE 4");
			lendDAO.increaseWarningAmount(lending, 1);
		}

	}

	@Override
	public List<Lending> checkByCustomer(Customer customer) {
		return (List<Lending>) lendDAO.loadByCustomer(customer);
	}

	@Override
	public boolean isPublicationOnLoan(Publication publication) {
		if (lendDAO.loadByPublication(publication).isEmpty()) {
			return false;
		}
		return true;
	}

	public ICustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(ICustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	public LendDAO getLendDAO() {
		return lendDAO;
	}

	public void setLendDAO(LendDAO lendDAO) {
		this.lendDAO = lendDAO;
	}

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

}
