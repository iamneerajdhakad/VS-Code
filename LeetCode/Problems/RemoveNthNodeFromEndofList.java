
import java.util.Scanner;

public class RemoveNthNodeFromEndofList {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    

        public static Node head = null;
        public static Node tail = null;

        public static Scanner sc = new Scanner(System.in);

        
        public static void EnterLinkedList() {
            
            System.out.print("Enter the number of nodes in the linked list: ");
            int n = sc.nextInt();
            System.out.println();

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter value of node " + i + ": ");
                int val = sc.nextInt();

                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
            }
        }
        
        public static void display() {

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


    public static Node removeNthFromEnd(Node head, int n) {

        Node temp = head;
        int size=0;

        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int m = size - n + 1;

        temp = head;

        for(int i = 1; i < m-1; i++){

            temp=temp.next;

        }

        temp.next = temp.next.next;

        return head;        
        
    }

    
    public static void main(String[] args) {

        EnterLinkedList();
    
        System.out.print("Enter The Nth Node Form End : ");
        int n = sc.nextInt();
        removeNthFromEnd(head, n);
            
        display();
    }
}
