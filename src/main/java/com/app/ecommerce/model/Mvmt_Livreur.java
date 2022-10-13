package com.app.ecommerce.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mvmt_Livreur implements Serializable {
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idMl;
	public Long getIdMl() {
		return idMl;
	}

	public void setIdMl(Long idMl) {
		this.idMl = idMl;
	}

	private String adDepart;
	private String adArrivee;
	//private DateTime date_heure;
	
	public Mvmt_Livreur() {
		super();
	}
	
	public Mvmt_Livreur(String adDepart, String adArrivee) {
		super();
		this.adDepart = adDepart;
		this.adArrivee = adArrivee;
	}

	public String getAdDepart() {
		return adDepart;
	}
	public void setAdDepart(String adDepart) {
		this.adDepart = adDepart;
	}
	public String getAdArrivee() {
		return adArrivee;
	}
	public void setAdArrivee(String adArrivee) {
		this.adArrivee = adArrivee;
	}

	@Override
	public String toString() {
		return "Mvmt_Livreur [adDepart=" + adDepart + ", adArrivee=" + adArrivee + "]";
	}
    	
}
