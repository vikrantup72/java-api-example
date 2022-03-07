package com.app.registration.service;

import java.util.List;

import com.app.registration.model.Category;
import com.app.registration.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService{
    
    @Autowired
    CategoryRepository repo;

    public Category saveCategory(Category category){
        return repo.save(category);
        
    }

    public List<Category> getAllCategory() {
        return (List<Category>)repo.findAll();
    }

    public Category getCategoryByName(String name) {
        return repo.findByName(name);
    }

    public void deleteCategory(int id) {
        repo.deleteById(id);
    }

}