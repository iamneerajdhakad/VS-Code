public class PalindromeLL {

    public static class Node{

        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static boolean palindrome(Node head){

        Node tail = head;

        while(tail.next != null){
            tail=tail.next;
        }

        while(head!=tail){

            if(head.data != tail.data) {
                return false;
                
            }
            
            head = head.next;
            tail = tail.prev;  
        }


        return true;

    }
    

    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(10);
        Node e = new Node(4);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println(palindrome(a));

        
    }
}
