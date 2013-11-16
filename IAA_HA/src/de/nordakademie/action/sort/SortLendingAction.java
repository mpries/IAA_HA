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

public class SortLendingAction extends ActionSupport implements Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1641859581800266719L;
	private ILendManager lendManager;
	private List<Lending> lendingsWithWarning;
	private String sort = new String();
	private String sortBy = new String();

	@Override
	public String execute() {
		setLendingsWithWarning(lendManager.loadAll());
		if (sort.equals(getText("up"))) {
			if (sortBy.equals(getText("lendingId"))) {
				Collections.sort(lendingsWithWarning, new SortLendingUpById());
			} else if (sortBy.equals(getText("loanDate"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByLoanDate());
			} else if (sortBy.equals(getText("returnDate"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByReturnDate());
			} else if (sortBy.equals(getText("customerId"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByCustomerId());
			} else if (sortBy.equals(getText("customerName"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByCustomerName());
			} else if (sortBy.equals(getText("publicationId"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByPublicationId());
			} else if (sortBy.equals(getText("publicationTitle"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByPublicationTitle());
			}
		} else if (sort.equals(getText("down"))) {
			if (sortBy.equals(getText("lendingId"))) {
				Collections
						.sort(lendingsWithWarning, new SortLendingDownById());
			} else if (sortBy.equals(getText("loanDate"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByLoanDate());
			} else if (sortBy.equals(getText("returnDate"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByReturnDate());
			} else if (sortBy.equals(getText("customerId"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByCustomerId());
			} else if (sortBy.equals(getText("customerName"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByCustomerName());
			} else if (sortBy.equals(getText("publicationId"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByPublicationId());
			} else if (sortBy.equals(getText("publicationTitle"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByPublicationTitle());
			}
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
