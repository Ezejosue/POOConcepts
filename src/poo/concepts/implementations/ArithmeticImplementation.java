package poo.concepts.implementations;

import poo.concepts.models.Arithmetic;

public class ArithmeticImplementation {
    public static void main(String[] args) {
        System.out.println("*** Creation of objects ***");
        var arithmetic1 = new Arithmetic(10, 5);
        arithmetic1.sum();
        arithmetic1.subtraction();
        System.out.println("\n");

        System.out.println("*** Creation of second object ***");
        Arithmetic arithmetic2 = new Arithmetic();
        System.out.println("*** Set values ***");
        arithmetic2.setOperator1(20);
        arithmetic2.setOperator2(10);
        System.out.println("*** Show values ***");
        System.out.println("Operator 1: " + arithmetic2.getOperator1());
        System.out.println("Operator 2: " + arithmetic2.getOperator2());
        arithmetic2.sum();
        arithmetic2.subtraction();
    }
}
