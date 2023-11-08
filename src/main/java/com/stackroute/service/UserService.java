package com.stackroute.service;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */

public class UserService {
    private String userName="John Doe";
    /**
     * declare a orderService variable as private final
     */

    /**
     * Autowire the OrderService bean using constructor-based injection
     */


    /**
     return user details
     */
    public String getUserDetails() {
        // Simulate fetching user details
        return this.userName;
    }

    /**
     * return the user's order details.
     */
    public String getUserOrders() {
        // return String with user details as User orders: orderService.getOrders()
    }
}
