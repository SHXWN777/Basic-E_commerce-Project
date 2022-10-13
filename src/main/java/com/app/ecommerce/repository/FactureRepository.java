package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {

}
