package de.nordakademie.model.interfaces;

import java.util.List;

import de.nordakademie.model.KindOfPublication;
import de.nordakademie.model.publication.Author;
import de.nordakademie.model.publication.Keyword;
import de.nordakademie.model.publication.Publication;
import de.nordakademie.model.publication.PublishedPublication;

public interface IPublicationManager {

	public List<Publication> view(String title, String author, String keyword);

	public void delete(Publication publication);

	public void create(Publication publication, List<String> authors, String kindOfPublication, List<String> description);

	public void edit(Publication publication);

	public Publication view(int id);
	
	public List<Publication> view();

	public List<Author> loadAllAuthors();

	public List<KindOfPublication> loadAllKinds();

	public List<Keyword> loadAllKeywords();

	void create(Publication publication);

	public boolean isISBNAlreadyAvailable(PublishedPublication publication);

}
