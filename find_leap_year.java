import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    if (year % 4 == 0) {
      System.out.print("Leap Year");
    } else {
      System.out.print("Not a leap year");
    }

    scanner.close();
  }
}
