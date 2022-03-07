package com.app.registration.repository;

import com.app.registration.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
    public Category findByName(String name);    

}