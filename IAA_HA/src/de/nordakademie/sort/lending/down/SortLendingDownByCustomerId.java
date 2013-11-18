package de.nordakademie.sort.lending.down;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum absteigenden Sortieren von Ausleihvorgängen nach der
 * Ausleiher ID
 */
public class SortLendingDownByCustomerId implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending2.getCustomer().getCustomerId()
				- lending1.getCustomer().getCustomerId();
	}
}
