package com.ricardoramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoramos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
