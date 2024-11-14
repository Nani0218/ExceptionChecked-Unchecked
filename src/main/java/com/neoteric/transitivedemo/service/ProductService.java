package com.neoteric.transitivedemo.service;

import com.neoteric.transitivedemo.exception.OutOfStockException;
import com.neoteric.transitivedemo.model.Product;

public abstract class ProductService extends Product {

    public ProductService(String productId, String name, double price, int stock) {
        super(productId,name,price,stock);
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > getStock()) {
            throw new OutOfStockException("Stock not available for "+getName());
        }
        // System.out.println(getStock());
        setStock(getStock()-quantity);
    }

    public abstract String getCategory();

}