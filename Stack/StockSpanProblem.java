import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stocks[], int span[]) {
        // Stack to store indices of stocks
        Stack<Integer> s = new Stack<>();
        
        // Span of first day is always 1
        span[0] = 1;
        s.push(0);  // Push the index of the first day

        // Loop through the rest of the days
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            // Pop elements from stack while current price is greater than stack's top price
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            // If stack is empty, current price is higher than all previous prices
            if (s.isEmpty()) {
                span[i] = i + 1;  // Span is current index + 1
            } else {
                span[i] = i - s.peek();  // Span is difference between current index and index of last higher price
            }

            // Push current day's index onto stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        // Example stock prices
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        // Call method to calculate span
        stockSpan(stocks, span);

        // Print the calculated span for each day
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
