import java.util.*;

public class Loop_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter any positive integer:");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            fact *= i;
        }
        System.out.println("factorial of =" + fact);
    }
}
