package com.charles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
