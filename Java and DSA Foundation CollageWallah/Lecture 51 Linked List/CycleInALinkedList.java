import java.util.Scanner;

public class CycleInALinkedList {
    
    
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

    public static boolean hasCycle(Node head){

        if(head == null || head.next==null) return false;

        Node slow = head;
        Node fast = head;

        while(fast!=null){

            if(slow==null) return false;

            slow = slow.next;

            if(fast.next==null)    return false;
            fast = fast.next.next;

            if(slow==fast)  return true;


        }

        
        return false;
    }


    public static void main(String[] args) {
        
    }

}
