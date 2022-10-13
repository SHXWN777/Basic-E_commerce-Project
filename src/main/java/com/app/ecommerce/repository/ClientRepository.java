package com.app.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
