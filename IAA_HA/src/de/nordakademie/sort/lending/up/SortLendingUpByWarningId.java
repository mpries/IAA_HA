package de.nordakademie.sort.lending.up;

import java.util.Comparator;

import de.nordakademie.model.Lending;

/**
 * @author Lukas Weikert
 * Klasse zum aufsteigenden Sortieren von Ausleihvorgängen nach der
 * Warnungs ID
 */
public class SortLendingUpByWarningId implements Comparator<Lending> {

	@Override
	public int compare(Lending lending1, Lending lending2) {
		return lending1.getWarning().getId() - lending2.getWarning().getId();
	}
}