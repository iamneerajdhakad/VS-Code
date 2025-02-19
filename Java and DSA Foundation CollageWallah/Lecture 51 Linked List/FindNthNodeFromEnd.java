import java.util.Scanner;

public class FindNthNodeFromEnd {

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

    public static Node NthNode(Node head,int N){
        int size = 0;

        Node temp = head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int st = size - N;

        temp = head;

        while(st-->0){

            temp = temp.next;
        }

        return temp;
    }

    public static Node SlowFast(Node head,int N){

        Node slow = head;
        Node fast = head;

        while(N-->0){

            fast=fast.next;
        }

        while(fast!=null){

            slow = slow.next;
            fast=fast.next;


        }

        return slow;

    }

    public static void main(String[] args) {

        Node q = SlowFast(insert(),inputInt());

        System.out.println(q.data);
        
        
    }
}
