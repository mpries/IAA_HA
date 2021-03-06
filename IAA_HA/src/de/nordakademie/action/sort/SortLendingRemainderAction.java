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

/**
 * @author Lukas Weikert 
 * Actionklasse sortiert die �bersichtstabelle der
 * �berzogenen Ausleihvorg�nge nach den gew�hlten Suchkriterien
 * 
 */
public class SortLendingRemainderAction extends ActionSupport implements Action {

	private static final long serialVersionUID = -5879829550237438881L;
	private ILendManager lendManager;
	private List<Lending> lendingsWithWarning;

	private String sort;
	private String sortBy;

	public void validate() {
		if (sort == null) {
			addFieldError("sort", getText("validationNoSearchcriteria"));
		}
		if (sortBy == null) {
			addFieldError("sortBy", getText("validationNoSearchcriteria"));
		}
	}

	@Override
	public String execute() {
		setLendingsWithWarning(lendManager.loadLendingsWithWarning());
		if (sort.equals(getText("up"))) {
			if (sortBy.equals(getText("lendingId"))) {
				Collections.sort(lendingsWithWarning, new SortLendingUpById());
			} else if (sortBy.equals(getText("warningId"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingUpByWarningId());
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
			} else if (sortBy.equals(getText("warningId"))) {
				Collections.sort(lendingsWithWarning,
						new SortLendingDownByWarningId());
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
