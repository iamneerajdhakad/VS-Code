
import java.util.Stack;



public class CelebrityProblem {

    @SuppressWarnings("UnnecessaryContinue")
    public static int celebrity(int M[][], int n){

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            st.push(i);
        }

        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();

            if(M[v1][v2]==0){
                st.push(v1);
            }

            else if(M[v2][v1] == 0) st.push(v2);
        }

        if(st.isEmpty())    return -1;

        int potential = st.pop();

        for(int i = 0; i < n; i++){
            if(M[potential][i]==1)    return -1;
        }
        
        for(int i = 0; i < n; i++){
            if(i==potential)    continue;
            else if(M[i][potential]==0)    return -1;
        }
        

        return potential;

    }

    public static void main(String[] args) {

        int n =3;

        int[][] M = {{0,1,0},
                     {0,0,0},
                     {0,1,0}};


        System.out.println(celebrity(M, n));
               
    }
}