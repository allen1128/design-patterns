package com.org.gof.pattern.prototype;

import com.org.gof.pattern.prototype.component.Order;
import com.org.gof.pattern.prototype.component.Product;

import java.util.Date;

public class Client {
    public static void main(String[] args){
        Order order = new Order(100, "order 1", new Date(), new Product("t-shirts", "product type 1"));
        Order order1 = (Order) order.clone();

        if (order.equals(order1)){
            System.out.println("shallow copy");
        } else {
            System.out.println("deep copy");
        }
    }
}
