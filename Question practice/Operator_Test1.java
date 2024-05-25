public class Operator_Test1 {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if (x > y && y < z) {
            System.out.println("Hello");
        }
        if (z > y && z < x) {
            System.out.println("java");
        }
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello java");
        }
    }
}
