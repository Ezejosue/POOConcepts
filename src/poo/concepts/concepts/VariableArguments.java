package poo.concepts.concepts;

public class VariableArguments {

    public static void main(String[] args) {

        // Testing the Calculator class methods
        Calculator calculator = new Calculator();

        // Addition
        int sum = calculator.add(1, 2, 3, 4, 5);
        System.out.println("Sum: " + sum);

        // Multiplication
        int product = calculator.multiply(1, 2, 3, 4, 5);
        System.out.println("Product: " + product);

        // Subtraction (first number - rest of the numbers)
        int difference = calculator.subtract(20, 1, 2, 3, 4);
        System.out.println("Difference: " + difference);

        // Division (first number / rest of the numbers)
        double quotient = calculator.divide(120.0, 2.0, 3.0, 4.0);
        System.out.println("Quotient: " + quotient);
    }

    static class Calculator {

        // Method to add any number of integers
        public int add(int... numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }

        // Method to multiply any number of integers
        public int multiply(int... numbers) {
            int product = 1;
            for (int number : numbers) {
                product *= number;
            }
            return product;
        }

        // Method to subtract any number of integers from the first number
        public int subtract(int first, int... numbers) {
            int difference = first;
            for (int number : numbers) {
                difference -= number;
            }
            return difference;
        }

        // Method to divide the first number by the rest of the numbers
        public double divide(double first, double... numbers) {
            double quotient = first;
            for (double number : numbers) {
                if (number != 0) {
                    quotient /= number;
                } else {
                    System.out.println("Division by zero is not allowed");
                    return Double.NaN;
                }
            }
            return quotient;
        }
    }
}
