import java.util.Stack;

public class MaxArea_Histogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        
        // Find next smallest to the right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length; // No smaller element to the right
            } else {
                nsr[i] = s.peek(); // Index of the next smaller element to the right
            }
            s.push(i);
        }

        // Find next smallest to the left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // No smaller element to the left
            } else {
                nsl[i] = s.peek(); // Index of the next smaller element to the left
            }
            s.push(i);
        }

        // Calculate maximum area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea); // Compare with maxArea
        }

        System.out.println("Max area is = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}
