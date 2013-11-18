package de.nordakademie.sort.lending.up;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum aufsteigenden Sortieren von Ausleihvorg�ngen nach dem
 * R�ckgabedatum
 */
public class SortLendingUpByReturnDate implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending1.getReturnDate().compareTo(lending2.getReturnDate());
	}
}
