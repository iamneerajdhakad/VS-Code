import java.util.Scanner;

public class TemplateLinkedList {
    
    public static Scanner sc = new Scanner(System.in);
    public static Node head = null;
    public static Node tail = null;


    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;

        }

    }
    
    public static Node insert(){

        int n = sc.nextInt();
            

        for (int i = 1; i <= n; i++) {
            
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
        System.out.flush();
    }

    public static void main(String[] args) {
        //Node head = insert();  // Insert nodes and get the head of the linked list
        //display(head);  
    }
    

}
