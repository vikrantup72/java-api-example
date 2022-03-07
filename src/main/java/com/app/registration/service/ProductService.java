package com.app.registration.service;

import java.util.List;

import com.app.registration.model.Product;

import com.app.registration.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{
    
    @Autowired
    ProductRepository repo;



public Product saveProduct(Product product){
    return repo.save(product);
    
}

public List<Product> getAllProduct() {
    return (List<Product>)repo.findAll();
}

public Product getProductByName(String name) {
    return repo.findByName(name);
}

public void deleteProduct(int id) {
    repo.deleteById(id);
}
}