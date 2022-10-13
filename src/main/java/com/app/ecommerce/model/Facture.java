package com.app.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture implements Serializable {
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long numFact;
	private Date dateFact;
	private Double montant;
	private String modePaiement;
		
	
	public Facture(Long numFact, Date dateFact, Double montant, String modePaiement) {
		super();
		this.numFact = numFact;
		this.dateFact = dateFact;
		this.montant = montant;
		this.modePaiement = modePaiement;
	}


	public Facture() {
		super();
	}
	
	
	public Facture(Date dateFact, Double montant, String modePaiement) {
		super();
		this.dateFact = dateFact;
		this.montant = montant;
		this.modePaiement = modePaiement;
	}


	public Long getNumFact() {
		return numFact;
	}
	public void setNumFact(Long numFact) {
		this.numFact = numFact;
	}
	public Date getDateFact() {
		return dateFact;
	}
	public void setDateFact(Date dateFact) {
		this.dateFact = dateFact;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}


	@Override
	public String toString() {
		return "Facture [numFact=" + numFact + ", dateFact=" + dateFact + ", montant=" + montant + ", modePaiement="
				+ modePaiement + "]";
	}

}
