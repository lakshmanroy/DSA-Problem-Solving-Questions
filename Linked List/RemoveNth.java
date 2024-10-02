

public class RemoveNth {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
           head=tail=newNode;
           return;
        }
        tail.next=newNode;
        tail=newNode;
    }
  public static void print(){
    if(head==null){
        System.out.println("LL is Empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");
  }

  public void deleteNthFromeEnd(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
  }
    public static void main(String[] args) {
       Remove_Nth ll=new Remove_Nth();
       ll.AddFirst(2);
       ll.AddFirst(1);
       ll.AddLast(3);
       ll.AddLast(4);
       ll.AddLast(5);


       ll.print();
       ll.deleteNthfromEnd(3);
       ll.print();
    }
}
