package com.ricardoramos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardoramos.course.entities.Product;
import com.ricardoramos.course.repositories.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findbyId(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
