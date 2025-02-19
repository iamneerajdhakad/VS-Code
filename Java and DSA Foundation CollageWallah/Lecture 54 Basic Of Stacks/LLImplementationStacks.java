
public class LLImplementationStacks {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LLStack{

        private Node head = null;
        private int size = 0;

        void push(int x){

            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){

            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }

            int x = head.data;
            head = head.next;

            return x;

        }

        @SuppressWarnings("unused")
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.data;
        }


        @SuppressWarnings("unused")
        void displayRev(){

            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayrec(Node h){
            
            if(h==null) return;

            displayrec(h.next);
            System.out.print(h.data +" ");
        }

        void display(){

            displayrec(head);
            System.out.println();
        }

        int size(){
            return size;
        }

        @SuppressWarnings("unused")
        boolean isEmpty(){

            if(head==null)  return true;

            else return false;
        }
    }

     public static void main(String[] args) {
            
        LLStack st = new LLStack();

        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(8);
        System.out.println(st.size());
        st.display();
        st.pop();
        st.push(4);
        st.display();
        st.push(7);
        st.display();
        System.out.println(st.size());
        st.push(4);

        st.push(4);
        st.push(4);

        
    }
    
    
}
