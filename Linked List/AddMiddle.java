public class AddMiddle {
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

    public static void add(int idx,int data){
       if(idx==0){
        
       }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
        temp=temp.next;
        i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.add(2, 9);
        ll.print();
    }
}
