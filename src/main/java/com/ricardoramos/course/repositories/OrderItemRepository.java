package com.ricardoramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoramos.course.entities.OrderItem;
import com.ricardoramos.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
