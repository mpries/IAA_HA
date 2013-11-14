package de.nordakademie.sort;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortUpByKindOfPublication implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication1.getKindOfPublication().getKind().compareTo(
				publication2.getKindOfPublication().getKind());
	}
}
