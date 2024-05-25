import java.util.*;

public class Function_Average {
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double x = sc.nextDouble();
        System.out.println("Enter your second number:");
        double y = sc.nextDouble();
        System.out.println("Enter your third number:");
        double z = sc.nextDouble();
        System.out.println("The average is " + average(x, y, z));

    }
}
