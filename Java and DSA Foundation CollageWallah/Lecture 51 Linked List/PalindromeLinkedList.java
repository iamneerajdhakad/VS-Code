import java.util.Scanner;

public class PalindromeLinkedList {
    
    
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

    public static Node reverse(Node head){

        Node cur = head;
        Node pre = null;
        Node frt = null;

        while(cur!=null){

            frt = cur.next;
            cur.next= pre;
            pre=cur;
            cur=frt;
        }

        return pre;
    }

    public static boolean idPalindrome(Node head){


        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            
            slow = slow.next;
            fast= fast.next.next;

        }

        Node temp = reverse(slow.next);

        slow.next= temp;

        Node p1 = head;
        Node p2 = slow.next;

        while(p2!=null){
            if(p1.data!=p2.data)      return false;
            p1 = p1.next;
            p2 = p2.next;
        }




        return true;

    }
    public static void main(String[] args) {
        
    }

}
