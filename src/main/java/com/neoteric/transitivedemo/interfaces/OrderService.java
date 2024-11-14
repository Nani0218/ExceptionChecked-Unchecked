package com.neoteric.transitivedemo.interfaces;


import com.neoteric.transitivedemo.exception.InvalidOrderException;
import com.neoteric.transitivedemo.exception.PaymentFailureException;
import com.neoteric.transitivedemo.model.Order;
import com.neoteric.transitivedemo.model.Product;

import java.util.List;

public interface OrderService {

    void placeOrder(Order order) throws InvalidOrderException, PaymentFailureException;;

    void cancelOrder(String orderId) throws InvalidOrderException;

    void updateOrder(String orderId, List<Product> productList) throws InvalidOrderException;

}