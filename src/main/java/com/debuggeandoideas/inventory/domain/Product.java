package com.debuggeandoideas.inventory.domain;

public class Product {

    private Long id;
    private String name;
    private Double price;

    public Product(Long id, String name, Double price) {
    }

    public Long getId() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public Double getPrice() {
        throw new UnsupportedOperationException();
    }
}
