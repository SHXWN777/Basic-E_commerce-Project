package com.app.ecommerce.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecommerce.model.Produit;
import com.app.ecommerce.repository.ProduitRepository;
import com.app.ecommerce.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public Produit updateProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Produit produit) {
		produitRepository.delete(produit);
	}

	@Override
	public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);	
	}

}
