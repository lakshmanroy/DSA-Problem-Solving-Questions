import java.util.ArrayList;

public class Pair_Sum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        // Find the breaking point
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // If no breaking point is found, the array is not rotated
        if (bp == -1) {
            bp = n - 1;
        }

        int lp = (bp + 1) % n; // smallest element index
        int rp = bp; // largest element index

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            // case 1: found the target sum
            if (sum == target) {
                return true;
            }

            // case 2: move the left pointer to the right
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3: move the right pointer to the left
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum2(list, target)); // Output should be true
    }
}
