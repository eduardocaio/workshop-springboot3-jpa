package com.eduardocaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardocaio.course.entities.OrderItem;
import com.eduardocaio.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
