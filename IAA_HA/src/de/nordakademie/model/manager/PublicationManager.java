package de.nordakademie.model.manager;

import java.util.List;

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

	@Override
	public List<Publication> view(String title, String author, String keyword) {
		// TODO Auto-generated method stub
		return publicationDAO.load(title, author, keyword);
	}




}
