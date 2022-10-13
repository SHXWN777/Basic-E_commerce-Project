package com.app.ecommerce.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long numProduit;
	private String nomProduit;
	private String description;
	private Double prix;
	private Double qteStock;
	
		
	public Produit() {
		super();
	}
	
	
	public Produit(String nomProduit, String description, Double prix, Double qteStock) {
		super();
		this.nomProduit = nomProduit;
		this.description = description;
		this.prix = prix;
		this.qteStock = qteStock;
	}


	public Long getNumProduit() {
		return numProduit;
	}
	public void setNumProduit(Long numProduit) {
		this.numProduit = numProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Double getQteStock() {
		return qteStock;
	}
	public void setQteStock(Double qteStock) {
		this.qteStock = qteStock;
	}


	@Override
	public String toString() {
		return "Produit [numProduit=" + numProduit + ", nomProduit=" + nomProduit + ", description=" + description
				+ ", prix=" + prix + ", qteStock=" + qteStock + "]";
	}

}
