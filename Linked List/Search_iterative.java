public class Search_iterative {
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

    public int itrSearch(int key){
       Node temp=head;
       int i=0;
       while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
        
       }
       return -1;
    }

    public static void main(String[] args) {
        Search_iterative ll = new Search_iterative();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.print();
        
        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(10));
    }
}
