package com.charles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
