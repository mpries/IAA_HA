package de.nordakademie.model.manager;

import de.nordakademie.dao.KindOfPublicationDAO;
import de.nordakademie.dao.PublicationDAO;
import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IKindOfPublicationManager;

public class KindOfPublicationManager implements IKindOfPublicationManager {

	private KindOfPublicationDAO kindOfPublicationDAO;
	private PublicationDAO publicationDAO;

	@Override
	public void save(String addKind) {
		kindOfPublicationDAO.save(new KindOfPublication(addKind));

	}

	@Override
	public KindOfPublication search(String searchKind) {
		return kindOfPublicationDAO.load(searchKind);
	}

	@Override
	public void delete(String kind) {
		kindOfPublicationDAO.delete(new KindOfPublication(kind));

	}

	public KindOfPublicationDAO getKindOfPublicationDAO() {
		return kindOfPublicationDAO;
	}

	public void setKindOfPublicationDAO(
			KindOfPublicationDAO kindOfPublicationDAO) {
		this.kindOfPublicationDAO = kindOfPublicationDAO;
	}

	@Override
	public boolean isAlreadyAvailable(String addKind) {
		if (kindOfPublicationDAO.load(addKind) == null) {
			return false;
		}
		return true;
	}

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}

	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}

	@Override
	public boolean isReferneced(KindOfPublication resultKind) {
		if (publicationDAO.loadByKind(resultKind.getKind()) == null) {
			return false;
		}
		return true;
	}
	
}
