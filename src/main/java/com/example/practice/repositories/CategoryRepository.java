package com.example.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
