package com.ws.agro_shop.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "products")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private Integer cost;
    private String description;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "manufacturer_id")
    private Integer manufacturerId;

    public Product() {
    }
}
