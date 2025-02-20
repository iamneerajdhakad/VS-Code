/*
At first glance, both lists contain 5, 12, and 10, but they are not the same nodes in memory, just identical values.

Why q is null?
Your method:

Moves the longer list ahead by the size difference.
Compares nodes (temp1 == temp2).
Stops when temp1 == temp2.
Since these are different objects in memory, the condition temp1 == temp2 never becomes true, so the function returns null, leading to the NullPointerException.
 */
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoLinkedList {
    
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

    public static Node intersection(Node h1,Node h2){
        
        Node temp1 = h1;
        Node temp2 = h2;

        HashSet<Node> s = new HashSet<>();

        int size1=0;

        while(temp1!=null){
            size1++;
            temp1=temp1.next;
        }
        
        
        int size2=0;
        while(temp2!=null){
            size2++;
            temp2=temp2.next;
        }

        temp1 = h1;
        temp2 = h2;

        if(size1>size2){
            int x = size1-size2;
            while(x-->0){
                temp1=temp1.next;
            }
        }
        else{
            int x = size2-size1;
            while(x-->0){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        
        return temp1;
    }

    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        HashSet<Node> s = new HashSet<>();

        Node t1 = firstHead;

       
        while (t1 != null) {
            s.add(t1);
            t1 = t1.next;
        }

        Node t2 = secondHead;

        
        while (t2 != null) {
            if (s.contains(t2)) {
                return t2.data; 
            }
            t2 = t2.next;
        }

        return -1;

    }



    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        
        Node p = new Node(7);
        Node q = new Node(8);
        Node r = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        p.next = q;
        q.next = r;
        r.next = c;

        System.out.println(findIntersection(a, p));
    }
}
