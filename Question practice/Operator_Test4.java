public class Operator_Test4 {
    public static void main(String[] args) {
        int x = 10, y = 5;

        int s1 = (y * (x / y + x / y));
        int s2 = (y + x / y + y * x / y);

        System.out.println(s1);
        System.out.println(s2);
    }
}
