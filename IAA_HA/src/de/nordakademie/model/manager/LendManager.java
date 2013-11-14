package de.nordakademie.model.manager;

import java.util.Date;
import java.util.List;

import de.nordakademie.dao.LendDAO;
import de.nordakademie.model.Customer;
import de.nordakademie.model.Lending;
import de.nordakademie.model.interfaces.ICustomerManager;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

public class LendManager implements ILendManager {
	
	private LendDAO lendDAO;
	private IPublicationManager publicationManager;
	private ICustomerManager customerManager;
	private Lending lend;


	
	@Override
	public Object view() {

		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object edit() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public List<Publication> loadPublications() {
		return publicationManager.view();
	}
	
	public ICustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(ICustomerManager customerManager) {
		this.customerManager = customerManager;
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
	}

	@Override
	public List<Lending> loadLendingsWithWarning() {
		return lendDAO.loadLendingsWithWarning();
	}

	@Override
	public List<Lending> loadAll() {
		return lendDAO.loadAll();
	}
	
	

}
