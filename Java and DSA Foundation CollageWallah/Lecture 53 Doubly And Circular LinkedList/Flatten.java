public class Flatten {
    
    @SuppressWarnings("unused")
    public static class Node {

        int data;
        Node prev;
        Node next;
        Node child;


        
        Node(int data){
            this.data=data;
        }
    }

    public static Node flatten(Node head){
        
        Node temp = head;

        while(temp!=null){
            
            Node t = temp.next;

            if(temp.child!=null){
                Node c = flatten(temp.child);
                temp.next=c;
                c.prev=temp;

                while(c.next!=null){
                    c=c.next;
                }

                c.next = t;
                if(t!=null) t.prev = c; 
            }
            temp.child = null;
            temp = t;

        }


        return head;
        
    }


    public static void main(String[] args) {
        
    }

    
}