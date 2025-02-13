package Demo;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        System.out.println("You entered string: " + s);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}