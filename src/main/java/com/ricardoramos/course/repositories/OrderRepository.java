package com.ricardoramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoramos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
