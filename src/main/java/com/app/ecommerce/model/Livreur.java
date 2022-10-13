package com.app.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livreur implements Serializable {
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idLivreur;
	private String nomLivreur;
	private String prenomLivreur;
	private Date dtBirthLivreur;
	private String emailLivreur;
	private String contactLivreur;
	private String adLivreur;
	
	
	public Livreur() {
		super();
	}
	
	
	public Livreur(String nomLivreur, String prenomLivreur, Date dtBirthLivreur, String emailLivreur,
			String contactLivreur, String adLivreur) {
		super();
		this.nomLivreur = nomLivreur;
		this.prenomLivreur = prenomLivreur;
		this.dtBirthLivreur = dtBirthLivreur;
		this.emailLivreur = emailLivreur;
		this.contactLivreur = contactLivreur;
		this.adLivreur = adLivreur;
	}


	public Long getIdLivreur() {
		return idLivreur;
	}
	public void setIdLivreur(Long idLivreur) {
		this.idLivreur = idLivreur;
	}
	public String getNomLivreur() {
		return nomLivreur;
	}
	public void setNomLivreur(String nomLivreur) {
		this.nomLivreur = nomLivreur;
	}
	public String getPrenomLivreur() {
		return prenomLivreur;
	}
	public void setPrenomLivreur(String prenomLivreur) {
		this.prenomLivreur = prenomLivreur;
	}
	public Date getDtBirthLivreur() {
		return dtBirthLivreur;
	}
	public void setDtBirthLivreur(Date dtBirthLivreur) {
		this.dtBirthLivreur = dtBirthLivreur;
	}
	public String getEmailLivreur() {
		return emailLivreur;
	}
	public void setEmailLivreur(String emailLivreur) {
		this.emailLivreur = emailLivreur;
	}
	public String getContactLivreur() {
		return contactLivreur;
	}
	public void setContactLivreur(String contactLivreur) {
		this.contactLivreur = contactLivreur;
	}
	public String getAdLivreur() {
		return adLivreur;
	}
	public void setAdLivreur(String adLivreur) {
		this.adLivreur = adLivreur;
	}


	@Override
	public String toString() {
		return "Livreur [idLivreur=" + idLivreur + ", nomLivreur=" + nomLivreur + ", prenomLivreur=" + prenomLivreur
				+ ", dtBirthLivreur=" + dtBirthLivreur + ", emailLivreur=" + emailLivreur + ", contactLivreur="
				+ contactLivreur + ", adLivreur=" + adLivreur + "]";
	}
	
}
