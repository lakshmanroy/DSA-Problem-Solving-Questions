import java.util.Scanner;

public class number_1_toUser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int range=sc.nextInt();
        int counter=1;
        while (counter<=range) {
            System.out.println(counter);
            counter++;
        }
        System.out.println();
    }
}
