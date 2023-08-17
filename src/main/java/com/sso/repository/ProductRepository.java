package com.sso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sso.entity.Product;

/**
 * 
 * @author Hetasvi.Ahir
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
