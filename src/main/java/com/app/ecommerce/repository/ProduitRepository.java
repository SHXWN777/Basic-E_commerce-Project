package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
