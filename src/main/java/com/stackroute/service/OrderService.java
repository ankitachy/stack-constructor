package com.stackroute.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */

public class OrderService {

    /**
     * declare a userService variable as private final
     */

    /**
     * Autowire the UserService bean using constructor-based injection
     * use @Lazy annotation to load the UserService bean lazily
     */


    /**
     * Retrieves a list of orders, and return the list
     */
    public List<String> getOrders() {
        // Simulate fetching orders
        List<String> orderList = new ArrayList<>();
        orderList.add("Order1");
        orderList.add("Order2");
        return orderList;
    }

    /**
     * Retrieves the user associated with an order and returns a formatted string with the user details.
     */
    public String getOrderUser() {
        // return String with user details as Ordered user: userService.getUserDetails();
    }
}