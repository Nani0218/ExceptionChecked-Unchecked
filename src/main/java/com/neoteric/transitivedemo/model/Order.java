package com.neoteric.transitivedemo.model;

import java.util.List;
import java.util.Map;

public class Order {
    private  String  orderId;

    private User user;

    private List<Product>productList;

    private double totalAmount;

    private boolean isPaid;

    public Order (String orderId, User user, List<Product>productList){
        this.orderId=orderId;
        this.productList=productList;
        this.isPaid=false;
        this.user=user;
        this.totalAmount=calculateTotal();
    }

    public boolean isPaid() {
        return isPaid=true;
    }

    public User getUser() {
        return user;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private double calculateTotal() {
        return productList.stream().mapToDouble(Product::getPrice).sum();

    }


    public void markAsPaid() {

    }
}
