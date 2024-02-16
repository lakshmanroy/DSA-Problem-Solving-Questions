import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number= sc.nextInt();
        String type=(number%2==0)? "even":"odd";
        System.out.println(type);
    }
}
