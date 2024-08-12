package org.proyects.snacksMachine.models;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable { // Serializable is used to save the object in a file
    private static int snackCounter = 0;
    private int snackId;
    private String name;
    private double price;

    public Snack() {
        this.snackId = ++Snack.snackCounter;
    }

    public Snack(String name, double price) {
        this(); // Call the constructor without parameters
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getSnackCounter() {
        return snackCounter;
    }

    public int getSnackId() {
        return snackId;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackId=" + snackId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snack snack)) return false;
        return getSnackId() == snack.getSnackId() && Double.compare(getPrice(), snack.getPrice()) == 0 && Objects.equals(getName(), snack.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSnackId(), getName(), getPrice());
    }
}
