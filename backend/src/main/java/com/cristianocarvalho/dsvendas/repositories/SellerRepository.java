package com.cristianocarvalho.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianocarvalho.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
