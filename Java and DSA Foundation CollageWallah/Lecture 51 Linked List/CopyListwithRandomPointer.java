import java.util.Scanner;

public class CopyListwithRandomPointer {
             
    public static Scanner sc = new Scanner(System.in);

    public static class Node{

        int data;
        Node next;
        Node random;

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

    public static Node copyRandomList(Node head) {
        
        Node head2 = new Node(0);
        Node temp2 =  head2;
        Node temp1 =  head;
 
        while(temp1!=null){
 
         Node t = new Node(temp1.data);
         temp2.next = t;
         temp2=t;
         temp1=temp1.next;
 
        }
 
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;
 
        Node temp = new Node (-1);
 
        while(temp1!=null){
 
             temp.next = temp1;
             temp1 = temp1.next;
             temp = temp.next;
 
             temp.next = temp2;
             temp2=temp2.next;
             temp=temp.next;
        }
 
        temp2 = head2;
        temp1 = head;
 
        while(temp1 != null){
             if(temp1.random==null)  temp2.random=null;
             else    temp2.random=temp1.random.next;
 
             temp1 = temp2.next;
             if(temp1!=null) temp2=temp1.next;
        }
 
        temp2 = head2;
        temp1 = head;
 
        while(temp1 != null){
 
             temp1.next=temp2.next;
             temp1=temp1.next;
             if(temp1==null) break;
             temp2.next=temp1.next;
             if(temp2.next==null)       break;
             temp2=temp2.next;
        }
        
        return head2;
 
         
    }


    public static void main(String[] args) {

        
        copyRandomList(insert());
        
    }

}
