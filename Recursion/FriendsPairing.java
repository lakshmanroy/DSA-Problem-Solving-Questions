public class FriendsPairing {
    public static int frindsPairing(int n) {
        // base
        if (n == 1 || n == 2) {
            return n;
        }
        return frindsPairing(n - 1) + (n - 1) * frindsPairing(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(3);

    }
}
