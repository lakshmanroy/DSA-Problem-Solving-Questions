import java.util.Scanner;

public class MethodHello {
    public static void HelloWorld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
    public static void calculateSum(int a,int b){
        int sum= a+b;
        System.out.println("Sum is :" +sum);
    }
   public static void main(String[] args) {
    // HelloWorld();

    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    calculateSum(a, b);
   } 
}

