public class Search_Recursion {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
          return -1;
        }
        return idx+1;
    }
    public static int recSearch(int key){
        return helper(head,key); 
    }

    public static void main(String[] args) {
        Search_Recursion ll = new Search_Recursion();
      
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.print();

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    }
}
