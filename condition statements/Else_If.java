import java.util.Scanner;

public class Else_If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int age= sc.nextInt();
        if (age>=18) {
            System.out.println("your can drive");
        }
        else if (age>=13 && age<=18) {
            System.out.println("you are teener");
        }
        else{
            System.out.println("you are adult");
        }
    }
}
