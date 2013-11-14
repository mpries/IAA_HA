package de.nordakademie.sort.publication.down;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortPublicationDownByKeyword implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getKeywords().get(0).getDescription()
				.compareTo(publication1.getKeywords().get(0).getDescription());
	}

}
