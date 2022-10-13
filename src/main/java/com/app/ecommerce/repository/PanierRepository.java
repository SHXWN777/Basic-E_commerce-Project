package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Panier;

public interface PanierRepository extends JpaRepository<Panier, Long> {

}
