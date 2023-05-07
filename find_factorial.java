import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = input.nextInt();

        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
