package com.openserver.springcloud.msvc.products.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.openserver.springcloud.msvc.products.entities.Product;
import com.openserver.springcloud.msvc.products.services.ProductService;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    final ProductService service;

    public ProductController(ProductService _ProductService) {
        this.service = _ProductService;
    }

    @GetMapping("/")
    public List<Product> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> details(@PathVariable Long id) {
        Optional<Product> productOptional = service.findById(id);
        if (productOptional.isPresent()) {
            return ResponseEntity.ok(productOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }
}
