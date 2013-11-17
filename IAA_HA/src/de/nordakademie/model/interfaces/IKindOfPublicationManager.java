package de.nordakademie.model.interfaces;

import de.nordakademie.model.KindOfPublication;
/**
 * 
 * @author Matthias Pries
 * @category Manager Interface:
 * 
 * Dieses Interface wird vom KindOfPublication implementiert und stellt alle benoetigten Mehtoden bereit
 *
 */
public interface IKindOfPublicationManager {

	void save(String addKind);

	KindOfPublication search(String searchKind);

	void delete(String kind);

	boolean isAlreadyAvailable(String addKind);

	boolean isReferneced(KindOfPublication resultKind);

}
