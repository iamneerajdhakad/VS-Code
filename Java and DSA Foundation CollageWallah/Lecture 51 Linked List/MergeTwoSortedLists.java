import java.util.Scanner;

public class MergeTwoSortedLists {
    
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

    @SuppressWarnings("unused")
    public static void merge(Node h1,Node h2){

        Node temp1=h1;
        Node temp2=h2;
        Node h = new Node(100);
        Node t=h;

        while(temp1.next!=null && temp2.next!=null){
            if(temp1.data<temp2.data){
            t.next=temp1;
            t=temp1;
            temp1=temp1.next;
            }

            else{
                t.next=temp2;
                t=temp2;
                temp2=temp2.next;
            }
        }

        if(temp1==null){t.next=temp2;}
        else{t.next=temp1;}

        display(h.next);

    }


    public static void main(String[] args) {
        merge(insert(), insert());
    }

}
