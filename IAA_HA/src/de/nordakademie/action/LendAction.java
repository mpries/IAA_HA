package de.nordakademie.action;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.Customer;
import de.nordakademie.model.Lending;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.model.publication.Publication;

public class LendAction extends ActionSupport implements Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8577228181964209162L;
	private ILendManager lendManager;
	private List<Publication> publications;
	private List<Customer> customers;
	private Date currentDate;
	private Date returnDate;
	private int customerId;
	private int publicationId;
	private Lending lend;
	
	
	public String supply(){
		createLoanDate();
		publications = lendManager.loadPublications();
		customers = lendManager.loadCustomer();
		return "supply";
	}
	
	public String create(){
		lend.setLoanDate(currentDate);
		lend.setReturnDate(returnDate);
		System.out.println("CREATE------->" + currentDate);		
		for (Customer c : customers) {							//Hier fliegt null pointer!
			System.out.println(c.getFirstName());
		}
//		lendManager.create(customerId, publicationId, currentDate, returnDate);
		return SUCCESS;
	}
	
	
	private void createLoanDate() {
		this.setCurrentDate(new Date());
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DATE, 7);
		this.setReturnDate(c.getTime());
	}
	

	public ILendManager getLendManager() {
		return lendManager;
	}
	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}


	public Date getCurrentDate() {
		return currentDate;
	}


	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}


	public Date getReturnDate() {
		return returnDate;
	}


	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}

	public Lending getLend() {
		return lend;
	}

	public void setLend(Lending lend) {
		this.lend = lend;
	}

}
