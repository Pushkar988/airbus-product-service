package com.productservice.airbusproductservice.airbus.controller;

import com.productservice.airbusproductservice.airbus.model.Product;
import com.productservice.airbusproductservice.airbus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public ResponseEntity addProduct(@RequestBody Product product){
       Product res = productService.addEditProduct(product);
       ResponseEntity responseEntity = new ResponseEntity<>(res, HttpStatus.OK);
       return responseEntity;
    }

    @GetMapping("/product")
    public ResponseEntity getAll(@RequestParam(value = "category",required = false) String category){
        List<Product> res = productService.getAll(category);
        ResponseEntity responseEntity = new ResponseEntity<>(res, HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("/product")
    public ResponseEntity updateProduct(@RequestBody Product product){
        Product res = productService.addEditProduct(product);
        ResponseEntity responseEntity = new ResponseEntity<>(res, HttpStatus.OK);
        return responseEntity;
    }


}
