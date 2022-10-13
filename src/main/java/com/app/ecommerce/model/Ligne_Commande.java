package com.app.ecommerce.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ligne_Commande implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Double qteCommander;

	
	public Ligne_Commande() {
		super();
	}

	
	public Ligne_Commande(Double qteCommander) {
		super();
		this.qteCommander = qteCommander;
	}

	
	public Double getQteCommander() {
		return qteCommander;
	}

	public void setQteCommander(Double qteCommander) {
		this.qteCommander = qteCommander;
	}


	@Override
	public String toString() {
		return "Ligne_Commande [qteCommander=" + qteCommander + "]";
	}
	
}
