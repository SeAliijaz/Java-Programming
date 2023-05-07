import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner inp = new Scanner(System.in);
      
        System.out.print("\nEnter Character: ");
        char c = (inp.nextLine()).charAt(0);
        

        switch (z) { 
            // Checking Vowel Character using Switch Case
            case 'A' && 'a':
            case 'E' && 'e':
            case 'I' && 'i':
            case 'O' && 'o':
            case 'U' && 'u':
                System.out.println(c + " is a Vowel.");
                break;

            default:
                System.out.println(c + " is a Non-Vowel Character.");
        }
    }
}
