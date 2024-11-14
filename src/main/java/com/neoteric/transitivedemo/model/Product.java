package com.neoteric.transitivedemo.model;

public class Product {
    private String name;
    private String productId;

    private double price;

    private int stock;

    public Product(String productId,String name,double price,int stock){

        this.name=name;
        this.productId=productId;
        this.price=price;
        this.stock=stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}
