package com.charles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
