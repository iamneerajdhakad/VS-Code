/*
 * Implementation
 * deletion
 * display
 * 
 * 
 */

public class DoublyLL {
    
    public static class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }

    }

    public static void display(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

    }
    
    public static void displayRev(Node tail){
        Node temp = tail;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();

    }

    public static void displayFomAnyNode(Node Any){

        Node temp = Any;

        while(temp.prev!=null){
            
            temp = temp.prev;
        }

        while(temp!=null){

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

    }

    public static Node InsertionAtHead(Node head,int x){

        Node t = new Node(x);

        t.next=head;
        head.prev=t;

        head  = t;

        return head;
    }

    public static Node InsertionAtTail(Node head,int x){

        Node Any = head;

        while(Any.next != null){
            Any=Any.next;
        }

        Node t = new Node(x);

        Any.next = t;
        t.prev = Any;

        Any = t;

        return Any;
    }

    public static Node InsertAtIdx(Node head,int idx, int x){

        Node t = new Node(x);
        Node temp = head;

        for(int i = 1; i <= idx-1; i++){
            temp = temp.next;
        }

        t.next=temp.next;
        temp.next = t;
        t.prev=temp;
        t.next.prev=t;


        return head;
        

    }

    public static void main(String[] args) {
        //4 10 2 99 13

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        // display(a);
        // displayRev(e);
        // displayFomAnyNode(c);

        // display(InsertionAtHead(a,10));

        // displayFomAnyNode(InsertionAtTail(e, 15));


        displayFomAnyNode(InsertAtIdx(a, 3, 50));
        display(InsertAtIdx(a, 3, 50));
        //displayRev(InsertAtIdx(a, 3, 50));

        
    }
}
