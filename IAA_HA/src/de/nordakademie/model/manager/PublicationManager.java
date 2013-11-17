package de.nordakademie.model.manager;

import java.util.Date;
import java.util.List;

import de.nordakademie.dao.AuthorDAO;
import de.nordakademie.dao.KeywordDAO;
import de.nordakademie.dao.KindOfPublicationDAO;
import de.nordakademie.dao.PublicationDAO;
import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.interfaces.ILendManager;
import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;
import de.nordakademie.model.publication.Publication;
import de.nordakademie.model.publication.PublishedPublication;

/**
 * 
 * @author Matthias Pries
 * @category Manager Class:
 * 
 *           Diese Klasse implementiert die Logik fuer das Model Publication
 * 
 */
public class PublicationManager implements IPublicationManager {

	private PublicationDAO publicationDAO;
	private KeywordDAO keywordDAO;
	private AuthorDAO authorDAO;
	private KindOfPublicationDAO kindOfPublicationDAO;
	private ILendManager lendManager;

	@Override
	public void delete(Publication publication) {
		publicationDAO.delete(publication);

	}

	@Override
	public void create(Publication publication) {
		publicationDAO.save(publication);

	}

	@Override
	public void edit(Publication publication) {
		publicationDAO.updateTitleAndKind(publication);

	}

	@Override
	public List<Publication> view(String title, String author, String keyword) {
		return publicationDAO.load(title, author, keyword);
	}

	public Publication view(int id) {
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
		publication.setAuthor(a);
		publication.setKeywords(k);
		publication.setKindOfPublication(kop);
		publicationDAO.save(publication);

	}

	@Override
	public boolean isISBNAlreadyAvailable(PublishedPublication publication) {
		if (!publicationDAO.loadByISBN(publication).isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public void addCopy(int id, int amount) {
		publicationDAO.addCopy(id, Math.abs(amount));

	}

	@Override
	public boolean isDateGreaterThanToday(PublishedPublication publication) {
		if (publication.getReleaseDate().after(new Date())) {
			return true;
		}
		return false;
	}

	@Override
	public void decreaseStored(Publication publication) {
		publication.setStored(publication.getStored() - 1);
		if (publication.getStored() > 0) {
			publicationDAO.save(publication);
		} else {
			publicationDAO.delete(publication);
		}
	}

	@Override
	public void increaseStored(int id) {
		Publication publication = publicationDAO.load(id);
		publication.setStored(publication.getStored() + 1);
		publicationDAO.save(publication);

	}

	@Override
	public boolean isReferenced(Publication publication) {
		if (lendManager.isPublicationOnLoan(publication)) {
			return true;
		}
		return false;
	}

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

	public void setKindOfPublicationDAO(
			KindOfPublicationDAO kindOfPublicationDAO) {
		this.kindOfPublicationDAO = kindOfPublicationDAO;
	}

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}

	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}

	public ILendManager getLendManager() {
		return lendManager;
	}

	public void setLendManager(ILendManager lendManager) {
		this.lendManager = lendManager;
	}

}
