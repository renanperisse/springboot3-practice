package com.example.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
