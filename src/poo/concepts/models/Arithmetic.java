package poo.concepts.models;

public class Arithmetic {
    private int operator1;
    private int operator2;

    public Arithmetic() {
    }

    public Arithmetic(int operator1, int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public void sum() {
        System.out.println("The sum is: " + (operator1 + operator2));
    }

    public void subtraction() {
        System.out.println("The subtraction is: " + (operator1 - operator2));
    }
}
