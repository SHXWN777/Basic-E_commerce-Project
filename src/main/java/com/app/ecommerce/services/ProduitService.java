package com.app.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.ecommerce.model.Produit;

@Service
public interface ProduitService {
	Produit saveProduit(Produit produit);
	List<Produit> getAllProduits();
	Produit getProduit(Long id);
	Produit updateProduit(Produit produit);
	void deleteProduit(Produit produit);
	void deleteProduitById(Long id);

}
