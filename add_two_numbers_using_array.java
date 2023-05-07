import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize an array with length 2
    int[] nums = new int[2];

    // Ask user to input two numbers
    for (int i = 0; i < nums.length; i++) {
      System.out.print("Enter number " + (i+1) + ": ");
      nums[i] = scanner.nextInt();
    }

    // Add the two numbers and store the result in a variable
    int result = nums[0] + nums[1];

    // Display the result
    System.out.println("The sum of " + nums[0] + " and " + nums[1] + " is " + result);

    // Close the scanner to avoid resource leaks
    scanner.close();
  }
}
