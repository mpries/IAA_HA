package de.nordakademie.model.interfaces;

import de.nordakademie.model.KindOfPublication;

public interface IKindOfPublicationManager {

	void save(String addKind);

	KindOfPublication search(String searchKind);

	void delete(String kind);

	boolean isAlreadyAvailable(String addKind);

	boolean isReferneced(KindOfPublication resultKind);

}
