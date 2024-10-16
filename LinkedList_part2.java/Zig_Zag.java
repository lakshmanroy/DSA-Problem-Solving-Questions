public class Zig_Zag {
    public static class Node{
        int data;
        Node next;

        Node(int data){
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
    System.out.println("null");
  }

    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid=slow;

        //reveres 2nd half
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alter merge -zig zag

        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }

    }
    public static void main(String args[]){
        Zig_Zag ll=new Zig_Zag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        ll.zigzag();
        ll.print();
        
        
    }
}
