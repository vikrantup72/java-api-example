package com.app.registration.controller;

import java.util.List;

import com.app.registration.model.Product;

import com.app.registration.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductController{

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        Product cat = productService.saveProduct(product);
        return cat;
    }
    @GetMapping("/get")
    public List<Product> getAllCategory(){
       List<Product> product =  productService.getAllProduct();
       return product;
    }

    @GetMapping("/get/{name}")
    public Product getProductByName(@PathVariable String name){
        Product product  =productService.getProductByName(name);
        return product;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id ){
        productService.deleteProduct(id);
}
}
