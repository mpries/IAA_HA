package de.nordakademie.sort;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortDownByKindOfPublication implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getKindOfPublication().getKind().compareTo(
				publication1.getKindOfPublication().getKind());
	}
}