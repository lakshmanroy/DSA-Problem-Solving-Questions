package Strings;
import java.util.*;

public class InputString {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Use nextLine() to read the entire line
        System.out.println("Your name is: " + name);
        sc.close(); // Close the scanner to prevent resource leak
    }
}
