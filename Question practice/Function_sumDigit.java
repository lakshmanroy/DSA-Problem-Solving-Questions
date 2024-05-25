import java.util.*;

public class Function_sumDigit {
    public static int sumDigit(int n) {
        int sumDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumDigit += lastDigit;
            n /= 10;
        }
        return sumDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigit(digits));

    }
}
