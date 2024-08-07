package org.proyects.salesSystem.implementations;

import org.proyects.salesSystem.models.Order;
import org.proyects.salesSystem.models.Product;

public class SaleSystemImplementation {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("*** Welcome to the Sales System ***");
        // Create 5 products
        order.addProduct(new Product("Shirt", 50));
        order.addProduct(new Product("Pants", 100));
        order.addProduct(new Product("Shoes", 200));
        order.addProduct(new Product("Hat", 20));
        order.addProduct(new Product("Socks", 10));
        // Show the order
        order.showOrder();

        //Second order
        var order2 = new Order();
        // Create 3 products
        order2.addProduct(new Product("Shirt", 50));
        order2.addProduct(new Product("Pants", 100));
        order2.addProduct(new Product("Shoes", 200));
        // Show the order
        System.out.println("\n");
        order2.showOrder();
    }
}
