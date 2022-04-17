package com.productservice.airbusproductservice.airbus.service;

import com.productservice.airbusproductservice.airbus.model.Product;
import com.productservice.airbusproductservice.airbus.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addEditProduct(Product product){
        Product product1= productRepository.save(product);
        return product1;
    }

    public List<Product> getAll(String category){
        if(StringUtils.isNoneEmpty(category)){
            return productRepository.findByCategoryIgnoreCase(category);
        }
        return productRepository.findAll();

    }

    public Product getProductById(Integer id){
        Product p =  productRepository.findById(id).get();
        return p;
    }


}
