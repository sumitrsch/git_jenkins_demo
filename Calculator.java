public class Calculator {
    public static void main(String[] args) {
        double num1 = 10; // Example number 1
        double num2 = 5;  // Example number 2
        double result;

        // Addition
        result = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);

        // Subtraction
        result = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);

        // Multiplication
        result = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);

        // Division
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}