import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator in Java");

        while (true) {
            // Prompt user for operator input
            System.out.println("Enter an Operator (+, -, *, /) or 'q' to Quit");
            String operator = scanner.nextLine();

            if (operator.equals("q")) {
                // User entered 'q', exit the program
                System.out.println("Exiting Simple Calculator!");
                break;
            }

            // Prompt user for first and second number input
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case "+":
                    // Addition operation
                    result = num1 + num2;
                    break;

                case "-":
                    // Subtraction operation
                    result = num1 - num2;
                    break;

                case "*":
                    // Multiplication operation
                    result = num1 * num2;
                    break;

                case "/":
                    // Division operation
                    if (num2 == 0) {
                        // Cannot divide by zero
                        System.out.println("Error: Cannot divide by zero");
                        continue;
                    }
                    result = num1 / num2;
                    break;

                default:
                    // Invalid operator
                    System.out.println("Error: Invalid operator");
                    continue;
            }

            // Print the result of the operation
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            // Consume the newline character left in the input stream
            scanner.nextLine(); 
        }

        // Close the scanner
        scanner.close();
    }
}
