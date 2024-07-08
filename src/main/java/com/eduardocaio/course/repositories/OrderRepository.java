package com.eduardocaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardocaio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
