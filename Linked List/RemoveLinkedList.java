public class RemoveLinkedList {
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
    public static int size;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
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

    public static void add(int idx,int data){
        
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
        temp=temp.next;
        i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
     int val=head.data;
     head=head.next;
     return val;
     
    }

    public static void main(String[] args) {
        RemoveLinkedList ll = new RemoveLinkedList();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.add(2, 3);
        ll.print();
     
        ll.removeFirst();
        ll.print();
    }
}
