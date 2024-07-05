package com.eduardocaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardocaio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
