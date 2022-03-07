package com.app.registration.controller;

import java.util.List;

import com.app.registration.model.Category;
import com.app.registration.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController{

    @Autowired
    CategoryService categoryService;

    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category){
        
        Category cat = categoryService.saveCategory(category);
        return cat;
    }
    @GetMapping("/get")
    public List<Category> getAllCategory(){
       List<Category> category=  categoryService.getAllCategory();
       return category;
    }

    @GetMapping("/get/{name}")
    public Category getCategoryByName(@PathVariable String name){
        Category category  = categoryService.getCategoryByName(name);
        return category;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable int id ){
        categoryService.deleteCategory(id);
    }
}