package com.ricardoramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoramos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
