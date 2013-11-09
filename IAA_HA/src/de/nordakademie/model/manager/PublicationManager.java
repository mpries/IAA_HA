package de.nordakademie.model.manager;

import de.nordakademie.dao.PublicationDAO;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;

public class PublicationManager implements IPublicationManager {
	
	private PublicationDAO publicationDAO;

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}

	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}

	@Override
	public Publication view(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Publication publication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Publication publication) {
		// TODO Auto-generated method stub
		publicationDAO.save(publication);
		
	}

	@Override
	public void edit(Publication publication) {
		// TODO Auto-generated method stub
		
	}




}
