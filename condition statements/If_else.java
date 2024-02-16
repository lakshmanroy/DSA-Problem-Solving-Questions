public class If_else {
    public static void main(String[] args) {
       int age=25;
       if (age>=18) {
          System.out.println("you can drive");
       } else if (age>=13 && age<=18) {
         System.out.println("you are teener");
       }
       else{
        System.out.println("your can't drive");
       }
    }
}