package de.nordakademie.action.sort;

import java.util.Collections;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;
import de.nordakademie.sort.publication.down.SortPublicationDownByAuthor;
import de.nordakademie.sort.publication.down.SortPublicationDownByDate;
import de.nordakademie.sort.publication.down.SortPublicationDownById;
import de.nordakademie.sort.publication.down.SortPublicationDownByKeyword;
import de.nordakademie.sort.publication.down.SortPublicationDownByKindOfPublication;
import de.nordakademie.sort.publication.down.SortPublicationDownByStored;
import de.nordakademie.sort.publication.down.SortPublicationDownByTitle;
import de.nordakademie.sort.publication.up.SortPublicationUpByAuthor;
import de.nordakademie.sort.publication.up.SortPublicationUpByDate;
import de.nordakademie.sort.publication.up.SortPublicationUpById;
import de.nordakademie.sort.publication.up.SortPublicationUpByKeyword;
import de.nordakademie.sort.publication.up.SortPublicationUpByKindOfPublication;
import de.nordakademie.sort.publication.up.SortPublicationUpByStored;
import de.nordakademie.sort.publication.up.SortPublicationUpByTitle;

public class SortPublicationAction extends ActionSupport implements Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6784882349214372936L;
	private IPublicationManager publicationManager;
	private String title;
	private String author;
	private String keyword;
	private String sort = new String();
	private String sortBy = new String();

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	private List<Publication> publications;
	private List<String> searchList;

	public List<String> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<String> searchList) {
		this.searchList = searchList;
	}

	@Override
	public String execute() {
		System.out.println("sort: " + sort);
		System.out.println("sortBy: " + sortBy);
		title = searchList.get(0);
		author = searchList.get(1);
		keyword = searchList.get(2);
		publications = publicationManager.view(title, author, keyword);
		System.out.println(publications.size() + "<--------------------");
		if (sort.equals(getText("up"))) {
			if (sortBy.equals(getText("id"))) {
				Collections.sort(publications, new SortPublicationUpById());
			} else if (sortBy.equals(getText("title"))) {
				Collections.sort(publications, new SortPublicationUpByTitle());
			} else if (sortBy.equals(getText("stored"))) {
				Collections.sort(publications, new SortPublicationUpByStored());
			} else if (sortBy.equals(getText("kindOfPublication"))) {
				Collections.sort(publications,
						new SortPublicationUpByKindOfPublication());
			} else if (sortBy.equals(getText("releaseDate"))) {
				Collections.sort(publications, new SortPublicationUpByDate());
			} else if (sortBy.equals(getText("authors"))) {
				Collections.sort(publications, new SortPublicationUpByAuthor());
			} else if (sortBy.equals(getText("keywords"))) {
				Collections
						.sort(publications, new SortPublicationUpByKeyword());
			}
		} else if (sort.equals(getText("down"))) {
			if (sortBy.equals(getText("id"))) {
				Collections.sort(publications, new SortPublicationDownById());
			} else if (sortBy.equals(getText("title"))) {
				Collections
						.sort(publications, new SortPublicationDownByTitle());
			} else if (sortBy.equals(getText("stored"))) {
				Collections.sort(publications,
						new SortPublicationDownByStored());
			} else if (sortBy.equals(getText("kindOfPublication"))) {
				Collections.sort(publications,
						new SortPublicationDownByKindOfPublication());
			} else if (sortBy.equals(getText("releaseDate"))) {
				Collections.sort(publications, new SortPublicationDownByDate());
			} else if (sortBy.equals(getText("authors"))) {
				Collections.sort(publications,
						new SortPublicationDownByAuthor());
			} else if (sortBy.equals(getText("keywords"))) {
				Collections.sort(publications,
						new SortPublicationDownByKeyword());
			}
		}
		return SUCCESS;

	}

	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public IPublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(IPublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Publication> getPublication() {
		return publications;
	}

	public void setPublication(List<Publication> publications) {
		this.publications = publications;
	}

}
