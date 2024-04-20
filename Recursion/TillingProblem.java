public class TillingProblem {
    public static int tillingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // int fnm1 = tillingProblem(n - 1);
        // int fnm2 = tillingProblem(n - 2);

        // int totalWay = fnm1 + fnm2;
        // return totalWay;
        return tillingProblem(n - 1) + tillingProblem(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
