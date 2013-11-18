package de.nordakademie.sort.lending.down;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum absteigenden Sortieren von Ausleihvorgängen nach der
 * Publikations ID
 */
public class SortLendingDownByPublicationId implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending2.getPublication().getId()
				- lending1.getPublication().getId();
	}
}