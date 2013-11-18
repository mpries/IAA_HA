package de.nordakademie.sort.lending.down;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum absteigenden Sortieren von Ausleihvorgängen nach dem
 * Titel der Publikation
 */
public class SortLendingDownByPublicationTitle implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending2.getPublication().getTitle()
				.compareTo(lending1.getPublication().getTitle());
	}

}