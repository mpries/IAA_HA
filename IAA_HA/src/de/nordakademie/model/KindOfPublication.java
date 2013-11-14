package de.nordakademie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KindOfPublication {

	@Id
	private String kind;

	public KindOfPublication(String kind) {
		this.kind = kind;
	}

	public KindOfPublication() {

	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
