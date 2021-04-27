package com.spring.controller;

import com.spring.entity.Product;
import com.spring.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/private/product")
public class HomeController {

    @Autowired
    ProductServiceImpl productService;
    Product product = new Product();

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        product.setCreatedDate(new Date());
        product.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productService.create(product));

    }
    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){

        product.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(productService.update(product));
    }

    @GetMapping
    public ResponseEntity<Page<Product>> getAllProduct(Pageable pageable){
        return ResponseEntity.ok(productService.findall(pageable));

    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Product>>getProductById(@PathVariable String id){
        return ResponseEntity.ok(productService.findById(id));


    }
    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id){
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
