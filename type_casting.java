
public class Main {
  public static void main(String[] args) {
    // Implicit type casting - widening conversion
    int numInt = 10;
    long numLong = numInt; // implicit type casting from int to long
    float numFloat = numLong; // implicit type casting from long to float
    double numDouble = numFloat; // implicit type casting from float to double
    System.out.println("Implicit type casting - Widening Conversion");
    System.out.println("int value: " + numInt);
    System.out.println("long value: " + numLong);
    System.out.println("float value: " + numFloat);
    System.out.println("double value: " + numDouble);
    
    // Explicit type casting - narrowing conversion
    double num = 10.123;
    float num1 = (float) num; // explicit type casting from double to float
    int num2 = (int) num1; // explicit type casting from float to int
    System.out.println("\nExplicit type casting - Narrowing Conversion");
    System.out.println("double value: " + num);
    System.out.println("float value: " + num1);
    System.out.println("int value: " + num2);
  }
}
