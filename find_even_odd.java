import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a Number to find Even or Odd: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println(number + " is Even number");
    } else {
      System.out.println(number + " Odd Number");
    }
  }
}
