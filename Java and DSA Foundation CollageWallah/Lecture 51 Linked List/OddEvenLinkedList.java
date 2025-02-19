
import java.util.Scanner;

public class OddEvenLinkedList {
         
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

    public static Node oddEvenList(Node head) {
 
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempo = odd;
        Node tempe = even;
        Node temp = head;

        tempo.next = head;

        while(temp!=null){

           
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next=temp;

            if(temp==null)  break;
            
            temp=temp.next;
            tempe=tempe.next;
        }

        odd = odd.next; 
        even = even.next;
        tempo.next=even;

        return odd;

        
    }


    public static void main(String[] args) {
        
    }
}
