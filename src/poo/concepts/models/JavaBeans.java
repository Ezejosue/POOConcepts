package poo.concepts.models;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var car = new Car();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setYear(2021);

        System.out.println("car: " + car);
    }
}

class Car implements Serializable {
    private String brand;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
