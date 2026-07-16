package com.cognizant.productservice.service;

import com.cognizant.productservice.entity.Product;
import com.cognizant.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product saveProduct(Product product){

        return repository.save(product);

    }

    public List<Product> getProducts(){

        return repository.findAll();

    }

}