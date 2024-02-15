import java.util.*;

public class inputSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a= sc.nextInt();
        System.out.println("Enter your second number:");
        int b= sc.nextInt();

        int sum= a+b;
        int product=a*b;
        System.out.println("sum of number:"+sum);
        System.out.println("product of number:"+product);
    }
}
