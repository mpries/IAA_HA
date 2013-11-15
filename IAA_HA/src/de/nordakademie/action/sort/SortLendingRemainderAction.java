package de.nordakademie.action.sort;

import java.util.Collections;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.Lending;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.sort.lending.down.SortLendingDownByCustomerId;
import de.nordakademie.sort.lending.down.SortLendingDownByCustomerName;
import de.nordakademie.sort.lending.down.SortLendingDownById;
import de.nordakademie.sort.lending.down.SortLendingDownByLoanDate;
import de.nordakademie.sort.lending.down.SortLendingDownByPublicationId;
import de.nordakademie.sort.lending.down.SortLendingDownByPublicationTitle;
import de.nordakademie.sort.lending.down.SortLendingDownByReturnDate;
import de.nordakademie.sort.lending.down.SortLendingDownByWarningId;
import de.nordakademie.sort.lending.up.SortLendingUpByCustomerId;
import de.nordakademie.sort.lending.up.SortLendingUpByCustomerName;
import de.nordakademie.sort.lending.up.SortLendingUpById;
import de.nordakademie.sort.lending.up.SortLendingUpByLoanDate;
import de.nordakademie.sort.lending.up.SortLendingUpByPublicationId;
import de.nordakademie.sort.lending.up.SortLendingUpByPublicationTitle;
import de.nordakademie.sort.lending.up.SortLendingUpByReturnDate;
import de.nordakademie.sort.lending.up.SortLendingUpByWarningId;

public class SortLendingRemainderAction extends ActionSupport implements Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5879829550237438881L;
	private ILendManager lendManager;
	private List<Lending> lendingsWithWarning;

	private String sort = new String();
	private String sortBy = new String();

	@Override
	public String execute() {
		setLendingsWithWarning(lendManager.loadLendingsWithWarning());
		switch (sort) {
		case "up":
			switch (sortBy) {
			case "Id":
				Collections.sort(lendingsWithWarning, new SortLendingUpById());
				break;
			case "loanDate":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByLoanDate());
				break;
			case "returnDate":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByReturnDate());
				break;
			case "Customer Id":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByCustomerId());
				break;
			case "Customer Name":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByCustomerName());
				break;
			case "Publication Id":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByPublicationId());
				break;
			case "Publication Title":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByPublicationTitle());
				break;
			case "Warning Id":
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByWarningId());
				break;

			default:
				break;
			}
			break;
		case "down":
			switch (sortBy) {
			case "Id":
				Collections
						.sort(lendingsWithWarning, new SortLendingDownById());
				break;
			case "loanDate":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByLoanDate());
				break;
			case "returnDate":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByReturnDate());
				break;
			case "Customer Id":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByCustomerId());
				break;
			case "Customer Name":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByCustomerName());
				break;
			case "Publication Id":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByPublicationId());
				break;
			case "Publication Title":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByPublicationTitle());
				break;
			case "Warning Id":
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByWarningId());
				break;

			default:
				break;
			}
			break;
		default:
			break;
		}
		return SUCCESS;

	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public ILendManager getLendManager() {
		return lendManager;
	}

	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

	public List<Lending> getLendingsWithWarning() {
		return lendingsWithWarning;
	}

	public void setLendingsWithWarning(List<Lending> lendingsWithWarning) {
		this.lendingsWithWarning = lendingsWithWarning;
	}

}
