import java.util.Scanner;

public class ReverseALinkedList {
     
    public static Scanner sc = new Scanner(System.in);

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;

        }

    }
    
    public static Node insert(){

        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for (int i = 1; i <= n; i++) {
            
            int val = sc.nextInt();
            
            Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    if (tail != null) {
                        tail.next = temp;
                    }
                    tail = temp;
                }
            }
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        System.out.print("LinkedList: ");
        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static int inputInt(){

        int num = sc.nextInt();
        
        return num;
    }


    public static Node Recursive(Node head){

        

        if(head.next==null) return head;

        Node newHead = Recursive(head.next);

        head.next.next=head;
        head.next=null;

        return newHead;

    }


    public static Node Iterative(Node head){

        Node pre = null;
        Node cur = head;
        Node frt = null;

        while(cur!=null){
 
            frt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=frt;

        }


        return pre;

    } 



    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);

        Node x = Iterative(a);

        display(x);


        
    }
    
}
