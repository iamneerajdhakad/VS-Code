import java.util.Scanner;

public class MiddleoftheLinkedList {

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


    public static Node middleNode(Node head) {
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int mid=size/2;
        temp=head;
        for(int i=0;i<mid;i++){
            temp=temp.next;
            
        }
        return temp;
    }

    public static Node SlowFast(Node head){

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){

            fast.next = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public static void main(String[] args) {

        Node q = middleNode(insert());
        
        System.out.println(q.data);

    }
}
