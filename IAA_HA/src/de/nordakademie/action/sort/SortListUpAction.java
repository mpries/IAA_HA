package de.nordakademie.action.sort;

import java.util.Collections;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.model.interfaces.IPublicationManager;
import de.nordakademie.model.publication.Publication;
import de.nordakademie.sort.SortDownByAuthor;
import de.nordakademie.sort.SortDownByDate;
import de.nordakademie.sort.SortDownById;
import de.nordakademie.sort.SortDownByKeyword;
import de.nordakademie.sort.SortDownByKindOfPublication;
import de.nordakademie.sort.SortDownByStored;
import de.nordakademie.sort.SortDownByTitle;
import de.nordakademie.sort.SortUpByAuthor;
import de.nordakademie.sort.SortUpByDate;
import de.nordakademie.sort.SortUpById;
import de.nordakademie.sort.SortUpByKeyword;
import de.nordakademie.sort.SortUpByKindOfPublication;
import de.nordakademie.sort.SortUpByStored;
import de.nordakademie.sort.SortUpByTitle;

public class SortListUpAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6784882349214372936L;
	private IPublicationManager publicationManager;
	private String title;
	private String author;
	private String keyword;
	private String sort;
	private String sortBy;

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

		switch (sort) {
		case "up":
			switch (sortBy) {
			case "id":
				Collections.sort(publications, new SortUpById());
				break;
			case "title":
				Collections.sort(publications, new SortUpByTitle());
				break;
			case "stored":
				Collections.sort(publications, new SortUpByStored());
				break;
			case "kindOfPublication":
				Collections.sort(publications, new SortUpByKindOfPublication());
				break;
			case "releaseDate":
				Collections.sort(publications, new SortUpByDate());
				break;
			case "author":
				Collections.sort(publications, new SortUpByAuthor());
				break;
			case "keyword":
				Collections.sort(publications, new SortUpByKeyword());
				break;

			default:
				break;
			}
			break;
		case "down":
			switch (sortBy) {
			case "id":
				Collections.sort(publications, new SortDownById());
				break;
			case "title":
				Collections.sort(publications, new SortDownByTitle());
				break;
			case "stored":
				Collections.sort(publications, new SortDownByStored());
				break;
			case "kindOfPublication":
				Collections.sort(publications,
						new SortDownByKindOfPublication());
				break;
			case "releaseDate":
				Collections.sort(publications, new SortDownByDate());
				break;
			case "author":
				Collections.sort(publications, new SortDownByAuthor());
				break;
			case "keyword":
				Collections.sort(publications, new SortDownByKeyword());
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}
		for (Publication p : publications) {
			System.out.println(p.getTitle());

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
