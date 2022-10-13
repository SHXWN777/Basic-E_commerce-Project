package com.app.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long numCmd;
	private Date dateCmd;
	private String etatCmd;
	
		
	public Commande() {
		super();
	}	
	
	
	public Commande(Date dateCmd, String etatCmd) {
		super();
		this.dateCmd = dateCmd;
		this.etatCmd = etatCmd;
	}


	public Long getNumCmd() {
		return numCmd;
	}
	public void setNumCmd(Long numCmd) {
		this.numCmd = numCmd;
	}
	public Date getDateCmd() {
		return dateCmd;
	}
	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	public String getEtatCmd() {
		return etatCmd;
	}
	public void setEtatCmd(String etatCmd) {
		this.etatCmd = etatCmd;
	}


	@Override
	public String toString() {
		return "Commande [numCmd=" + numCmd + ", dateCmd=" + dateCmd + ", etatCmd=" + etatCmd + "]";
	}
	
}
