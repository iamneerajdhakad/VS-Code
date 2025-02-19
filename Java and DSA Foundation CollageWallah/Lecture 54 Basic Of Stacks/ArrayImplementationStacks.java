

public class ArrayImplementationStacks {

    public static class Stack{
        
        @SuppressWarnings("FieldMayBeFinal")
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){

            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }

            arr[idx++]=x;
        }

        @SuppressWarnings("unused")
        int peek(){

            if(idx==0){

                System.out.println("Stack is Empty");
                return -1;
            }

            return arr[idx-1];
        }

        int pop(){

            if(idx==0){

                System.out.println("Stack is Empty");
                return -1;
            }

            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;

            return top; 
        }

        void display(){

            for(int i = 0; i < idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){

            return idx;
        }

        @SuppressWarnings("unused")
        boolean isEmpty(){

            if(size()>0)  return false;

            else return true;
        }

        boolean isFull(){

            if(idx==arr.length) return true;

            else    return false;
        }
    }

    public static void main(String[] args) {
            
        Stack st = new Stack();

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
