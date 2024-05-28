import java.util.*;

public class Function_even_odd {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int nums = sc.nextInt();
        if (isEven(nums)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
