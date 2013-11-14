package de.nordakademie.sort;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortDownByAuthor implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getAuthors().get(0).getName()
				.compareTo(publication1.getAuthors().get(0).getName());
	}

}
