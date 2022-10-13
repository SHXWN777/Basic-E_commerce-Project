package com.app.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.ecommerce.model.Client;

@Service
public interface ClientService {
	Client saveClient (Client client);
	List<Client> getAllClients();
	Client getClient(Long id);
	//Client updateClient (Client client);
	void deleteClient (Client client);
	void deleteClientById(Long id);

}
