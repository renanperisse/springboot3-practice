package com.example.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
