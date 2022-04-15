package com.productservice.airbusproductservice.airbus.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_tbl")
public class Product {

    @Column(name = "product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_category")
    private String category;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_description")
    private String description;

    @Column(name = "units")
    private Integer units;

    public Product(){}

}
