package poo.concepts.implementations;

import poo.concepts.models.Arithmetic;

public class ExceptionImplementation {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(10, 0);
        arithmetic.sum();
        arithmetic.subtraction();
        arithmetic.multiplication();
        arithmetic.division();
    }
}
