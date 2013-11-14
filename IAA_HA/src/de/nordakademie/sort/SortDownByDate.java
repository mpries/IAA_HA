package de.nordakademie.sort;

import java.util.Comparator;

import de.nordakademie.model.publication.Publication;

public class SortDownByDate implements Comparator<Publication> {

	@Override
	public int compare(Publication publication1, Publication publication2) {
		return publication2.getReleaseDate().compareTo(
				publication1.getReleaseDate());
	}
}
