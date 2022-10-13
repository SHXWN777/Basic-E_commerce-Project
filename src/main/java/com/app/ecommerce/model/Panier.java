package com.app.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panier implements Serializable{
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idPanier;
	private Date dtCreationPan;
	
	
	public Panier() {
		super();
	}
	
	
	public Panier(Date dtCreationPan) {
		super();
		this.dtCreationPan = dtCreationPan;
	}


	public Long getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(Long idPanier) {
		this.idPanier = idPanier;
	}
	public Date getDtCreationPan() {
		return dtCreationPan;
	}
	public void setDtCreationPan(Date dtCreationPan) {
		this.dtCreationPan = dtCreationPan;
	}


	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", dtCreationPan=" + dtCreationPan + "]";
	}

	
	
	

}
