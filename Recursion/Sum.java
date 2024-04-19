public class Sum {
    public static int calSum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + calSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calSum(5));

    }
}
