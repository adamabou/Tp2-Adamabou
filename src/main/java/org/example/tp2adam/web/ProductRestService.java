package org.example.tp2adam.web;

import org.example.tp2adam.entities.Product;
import org.example.tp2adam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class ProductRestService {
    private  ProductRepository productRepository;

    public ProductRestService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


  @GetMapping("/products")
    public List<Product> products(){
      return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id){
        Product product=productRepository.findById(id).orElse(null);
        return product;
    }
}
