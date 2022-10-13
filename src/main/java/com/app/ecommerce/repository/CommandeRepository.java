package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
