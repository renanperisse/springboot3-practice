package com.example.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
