package com.app.ecommerce.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livraison implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long numFact;
	private String adLivraison;
	//private DateTimeFormat dhLivraison;
	private Date dateLivraison;
	private Time heureLivraison;
	
	
	public Livraison() {
		super();
	}
	
	
	public Livraison(Long numFact, String adLivraison, Date dateLivraison, Time heureLivraison) {
		super();
		this.numFact = numFact;
		this.adLivraison = adLivraison;
		this.dateLivraison = dateLivraison;
		this.heureLivraison = heureLivraison;
	}


	public Long getNumFact() {
		return numFact;
	}
	public void setNumFact(Long numFact) {
		this.numFact = numFact;
	}
	public String getAdLivraison() {
		return adLivraison;
	}
	public void setAdLivraison(String adLivraison) {
		this.adLivraison = adLivraison;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public Time getHeureLivraison() {
		return heureLivraison;
	}
	public void setHeureLivraison(Time heureLivraison) {
		this.heureLivraison = heureLivraison;
	}


	@Override
	public String toString() {
		return "Livraison [numFact=" + numFact + ", adLivraison=" + adLivraison + ", dateLivraison=" + dateLivraison
				+ ", heureLivraison=" + heureLivraison + "]";
	}

}
