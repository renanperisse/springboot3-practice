package com.example.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
