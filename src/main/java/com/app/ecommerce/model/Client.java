package com.app.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String username;
	private Date dateofBirth;
	private String password;
	private String emailClient;
	private String adresseClient;
	private String contactClient;
	
	
	
	public Client() {
		super();
	}
	
	
	
	public Client(String nomClient, String prenomClient, String username, Date dateofBirth, String password,
			String emailClient, String adresseClient, String contactClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.username = username;
		this.dateofBirth = dateofBirth;
		this.password = password;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		this.contactClient = contactClient;
	}



	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public String getContactClient() {
		return contactClient;
	}
	public void setContactClient(String contactClient) {
		this.contactClient = contactClient;
	}



	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", username=" + username + ", dateofBirth=" + dateofBirth + ", password=" + password
				+ ", emailClient=" + emailClient + ", adresseClient=" + adresseClient + ", contactClient="
				+ contactClient + "]";
	}

	    	

}
