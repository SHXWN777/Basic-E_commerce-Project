package com.app.ecommerce.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.ecommerce.model.Client;
import com.app.ecommerce.repository.ClientRepository;
import com.app.ecommerce.services.ClientService;

import java.util.List;



@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	@Override
	public Client saveClient(Client client) {
		
//		Client client = new Client(client.getNomClient(), client.getPrenomClient(),
//                client.getUsername(), passwordEncoder.encode(client.getPassword()),
//                client.getEmail(), client.getAdresseClient, client.getContactClient());

		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Client client) {
		clientRepository.delete(client);
	}
	
	@Override
	public Client getClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public void deleteClientById(Long id) {
		clientRepository.deleteById(id);
	}
	
	
	

}
