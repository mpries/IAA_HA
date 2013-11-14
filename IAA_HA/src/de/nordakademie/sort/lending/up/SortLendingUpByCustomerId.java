package de.nordakademie.sort.lending.up;

import java.util.Comparator;

import de.nordakademie.model.Lending;

public class SortLendingUpByCustomerId implements
		Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending1.getCustomer().getCustomerId()
				- lending2.getCustomer().getCustomerId();
	}
}