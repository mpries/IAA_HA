package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortPublicationDownByKindOfPublication implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getKindOfPublication().getKind().compareTo(
				publication1.getKindOfPublication().getKind());
	}
}