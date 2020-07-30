package com.charles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
