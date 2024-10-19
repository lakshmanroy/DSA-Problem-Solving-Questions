
import java.util.Stack;

public class ReverseStack {
     // Method to insert an element at the bottom of the stack
     public static void PushAtButtom(Stack<Integer> s, int data) {
        // Base case: if the stack is empty, push the data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Recursive case: Pop the top element and insert data at the bottom
        int top = s.pop();
        PushAtButtom(s, data);
        
        // Push the previously popped element back on the stack
        s.push(top);
    }

    // Method to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> s) {
        // Base case: If stack is empty, do nothing
        if (s.isEmpty()) {
            return;
        }

        // Recursive case: Pop the top element
        int top = s.pop();

        // Reverse the remaining stack
        reverseStack(s);

        // Insert the popped element at the bottom of the reversed stack
        PushAtButtom(s, top);
    }

    public static void main(String[] args) {
    // Create a stack and push some elements
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println("Original Stack: " + s);

    // Call the reverseStack method
    reverseStack(s);

    // Print the reversed stack
    System.out.println("Reversed Stack: " + s);
}
}
