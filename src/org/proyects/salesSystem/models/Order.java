package org.proyects.salesSystem.models;

public class Order {
    private final int orderId;
    private Product[] products;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;
    private static int orderCounter;

    public Order() {
        this.orderId = ++Order.orderCounter;
        this.products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.productCounter <= MAX_PRODUCTS) {
            this.products[this.productCounter++] = product;
        } else {
            System.out.println("The order is full");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < this.productCounter; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("\tOrder: " + this.orderId);
        System.out.println("\tTotal: $" + this.calculateTotal());
        System.out.println("Products:");
        for (int i = 0; i < this.productCounter; i++) {
            System.out.println("\t\t" + this.products[i]);
        }
    }
}
