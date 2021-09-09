package com.cristianocarvalho.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianocarvalho.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
