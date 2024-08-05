package poo.concepts.implementations;

import poo.concepts.models.Arithmetic;

public class ArithmeticImplementation {
    public static void main(String[] args) {
        System.out.println("*** Creation of objects ***");
        var arithmetic1 = new Arithmetic(10, 5);
        arithmetic1.sum();
        arithmetic1.subtraction();
    }
}
