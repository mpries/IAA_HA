package de.nordakademie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author Timm Seguin
 *
 */
@Entity
public class Warning {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int amount = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
