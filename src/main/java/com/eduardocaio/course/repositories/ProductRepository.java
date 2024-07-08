package com.eduardocaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardocaio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
