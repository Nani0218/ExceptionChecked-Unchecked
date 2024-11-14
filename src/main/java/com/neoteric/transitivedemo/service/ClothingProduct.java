package com.neoteric.transitivedemo.service;

import com.neoteric.transitivedemo.exception.OutOfStockException;

public class ClothingProduct extends ProductService{

    public ClothingProduct(String productId, String name, double price, int stock) {
        super(productId, name, price, stock);
    }

    @Override
    public void reduceStock(int quantity) throws OutOfStockException {
        super.reduceStock(quantity);
    }

    @Override
    public String getCategory() {
        return "clothing";
    }
}