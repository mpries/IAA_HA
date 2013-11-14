package de.nordakademie.model.manager;

import java.util.List;

import de.nordakademie.dao.AuthorDAO;
import de.nordakademie.dao.KeywordDAO;
import de.nordakademie.dao.KindOfPublicationDAO;
import de.nordakademie.dao.PublicationDAO;
import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;
import de.nordakademie.model.publication.Publication;

public class PublicationManager implements IPublicationManager {
	
	private PublicationDAO publicationDAO;
	private KeywordDAO keywordDAO;
	private AuthorDAO authorDAO;
	private KindOfPublicationDAO kindOfPublicationDAO;
	

	public KeywordDAO getKeywordDAO() {
		return keywordDAO;
	}

	public void setKeywordDAO(KeywordDAO keywordDAO) {
		this.keywordDAO = keywordDAO;
	}

	public AuthorDAO getAuthorDAO() {
		return authorDAO;
	}

	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	public KindOfPublicationDAO getKindOfPublicationDAO() {
		return kindOfPublicationDAO;
	}

	public void setKindOfPublicationDAO(KindOfPublicationDAO kindOfPublicationDAO) {
		this.kindOfPublicationDAO = kindOfPublicationDAO;
	}

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}

	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}


	@Override
	public void delete(Publication publication) {
		publicationDAO.delete(publication);
		
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
	
	public Publication view(int id){
		return publicationDAO.load(id);
		
	}

	@Override
	public List<Publication> view() {
		return publicationDAO.loadAll();
	}

	@Override
	public List<Author> loadAllAuthors() {
		return authorDAO.loadAll();
	}

	@Override
	public List<KindOfPublication> loadAllKinds() {
		return kindOfPublicationDAO.loadAll();
	}

	@Override
	public List<Keyword> loadAllKeywords() {
		return keywordDAO.loadAll();
	}

	@Override
	public void create(Publication publication, List<String> authors,
			String kindOfPublication, List<String> description) {
		List<Author> a = authorDAO.load(authors);
		List<Keyword> k = keywordDAO.load(description);
		KindOfPublication kop = kindOfPublicationDAO.load(kindOfPublication);
		for (Keyword keyword : k) {
			System.out.println(keyword.getDescription() + "<--------");
		}
		publication.setAuthor(a);
		publication.setKeywords(k);
		publication.setKindOfPublication(kop);
		publicationDAO.save(publication);
		
	}




}
