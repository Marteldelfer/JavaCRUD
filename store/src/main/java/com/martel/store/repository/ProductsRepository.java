package com.martel.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martel.store.models.Product;

public interface ProductsRepository extends JpaRepository <Product, Integer>{
    
}
