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
        try {
            System.out.println("The sum is: " + (operator1 + operator2));
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void subtraction() {
        try {
            System.out.println("The subtraction is: " + (operator1 - operator2));
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void multiplication() {
        try {
            System.out.println("The multiplication is: " + (operator1 * operator2));
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void division() {
        try {
            System.out.println("The division is: " + (operator1 / operator2));
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public int getOperator1() {
        return operator1;
    }

    public void setOperator1(int operator1) {
        this.operator1 = operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public void setOperator2(int operator2) {
        this.operator2 = operator2;
    }
}
