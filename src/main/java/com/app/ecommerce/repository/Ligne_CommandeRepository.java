package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Ligne_Commande;

public interface Ligne_CommandeRepository extends JpaRepository<Ligne_Commande, Double> {

}
