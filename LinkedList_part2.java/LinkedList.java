public class LinkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    // Helper function to find the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // mid node
    }

    // Merge sort function
    public Node mergeSort(Node head) {
        // Base case: if head is null or there's only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        Node mid = getMid(head);

        // Split the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    // Merge two sorted linked lists
    public Node merge(Node left, Node right) {
        // Base cases
        if (left == null) return right;
        if (right == null) return left;

        Node result;

        // Compare the data of the two lists
        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = list.new Node(4);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(1);
        list.head.next.next.next = list.new Node(3);

        list.head = list.mergeSort(list.head);

        // Print the sorted list
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
