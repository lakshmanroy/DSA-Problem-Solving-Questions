import java.util.Scanner;

public class Condition_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("x is greater than 0");
        } else {
            System.out.println("x is less than or equal 0");
        }
    }
}
