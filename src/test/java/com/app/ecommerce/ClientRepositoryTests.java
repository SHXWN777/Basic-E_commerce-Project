//package com.app.ecommerce;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import com.app.ecommerce.model.Client;
//import com.app.ecommerce.repository.ClientRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class ClientRepositoryTests {
//	
//	
//	@Autowired
//	private ClientRepository repo;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testCreateClient() {
//		Client client = new Client();
//		client.setNomClient("toto");
//		client.setPrenomClient("tata");
//		client.setUsername("supa");
//		//client.setDateofBirth("05-07-2022");
//		client.setPassword("good");
//		client.setEmailClient("toto@tata.cd");
//		client.setAdresseClient("Nzela ya mayi");
//		client.setContactClient("010203040506");
//		
//		Client savedClient = repo.save(client);
//		Client existClient =  entityManager.find(Client.class, savedClient.getIdClient());
//		assertThat(existClient.getNomClient()).isEqualTo(client.getEmailClient());
//	}
//
//}
//
