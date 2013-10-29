package de.nordakademie.action.publication;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.action.interfaces.ICreateAction;
import de.nordakademie.model.enumaration.KindOfPublication;

public class PublicationCreateAction extends ActionSupport implements
		ICreateAction, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5738244878962689934L;
	protected String title;
	protected String author;
	protected Date releaseDate;
	protected String isbn;
	protected String keyword;
	protected String publisher;
	protected KindOfPublication kindOfPublication;
	private List<String> keywords;

	@Override
	public String execute() throws Exception {
		seperateKeywords();
		switch (kindOfPublication) {
		case BOOK:
			// TODO
			System.out.println("BOOK");
		case MAGAZINE:
			// TODO
		case ACADAMIC:
			// TODO
		default:
			return ERROR;
		}
	}

	private void seperateKeywords() {
		// TODO Trennt die Keywords und packt sie in eine Liste

	}

	public void validate() {
		// TODO Alles ueberpruefen was nicht in der xml machbar ist

	}


	public KindOfPublication getKindOfPublication() {
		return kindOfPublication;
	}

	public void setKindOfPublication(KindOfPublication kindOfPublication) {
		this.kindOfPublication = kindOfPublication;
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}
