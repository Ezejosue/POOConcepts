package org.proyects.salesSystem.models;

public class Product {
    private final int productId;
    private String name;
    private double price;
    private static int productCounter;


    public Product(String name, double price) {
        this.productId = ++Product.productCounter;
        this.name = name;
        this.price = price;

    }

    public int getProductId() {
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + this.productId +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}
