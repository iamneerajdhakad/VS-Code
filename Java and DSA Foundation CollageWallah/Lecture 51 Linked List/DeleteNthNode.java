import java.util.Scanner;

public class DeleteNthNode {
    
    public static Scanner sc = new Scanner(System.in);

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
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
    public static Node DeletenthNode(Node head, int k){

        
        Node slow= head;
        Node fast = head;

        while(k-->0){
            
            fast = fast.next;
        }

        if(fast  == null){

            head = head.next;
            return head;
        }

        while(fast.next!=null){

            fast= fast.next;
            slow = slow.next;

        }

        slow.next=slow.next.next;
        
        return head;

    }

    public static void main(String[] args) {



        Node q = DeletenthNode(insert(),inputInt());

        
        display(q);
    }
}
