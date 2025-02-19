public class TwoSumInDLL {

    public static class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }

    }

    public static void twoSum(Node head,int target){


        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        while(head.data<tail.data){

            if(head.data + tail.data == target){

            System.out.println(head.data + " " + tail.data);    
            break;

            }

            else if (head.data + tail.data > target)    tail = tail.prev;

            else head = head.next;
        }

    }

    public static void main(String[] args) {
        //4 10 2 99 13

        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(13);
        Node e = new Node(99);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        twoSum(a, 12);

    }
    
}
