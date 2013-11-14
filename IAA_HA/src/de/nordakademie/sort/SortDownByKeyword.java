package de.nordakademie.sort;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortDownByKeyword implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getKeywords().get(0).getDescription()
				.compareTo(publication1.getKeywords().get(0).getDescription());
	}

}
