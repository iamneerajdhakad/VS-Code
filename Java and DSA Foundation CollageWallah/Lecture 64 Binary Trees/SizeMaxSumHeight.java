public class SizeMaxSumHeight {

    public  static class Node{

        int val ;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }

    public static int Size(Node root){
        if(root==null)  return 0;

        return 1 + Size(root.left) + Size(root.right);
    }


    public static int Sum(Node root){

        if(root==null)  return 0;

        return root.val + Sum(root.right)+Sum(root.left);
    }


    public static int Max(Node root){

        if(root==null) return Integer.MIN_VALUE;

        int maxLeft = root.val; 
        int maxRight = root.val;

        maxLeft = Math.max(maxLeft, Max(root.left));
        maxRight = Math.max(maxRight, Max(root.right));

        return maxLeft > maxRight ? maxLeft : maxRight;
    }

    public static int max(Node root){

        if(root==null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }


    public static int height(Node root){

        if(root==null  || (root.left==null && root.right==null))  return 0;

        return 1 + Math.max(height(root.left),height(root.right));

    }



    public static void main(String[] args) {
        
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left=a;
        root.right=b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(11);
        b.right=e;

        System.out.println(Size(root));
        System.out.println(Sum(root));
        System.out.println(Max(root));
        System.out.println(height(root));

        
    }
}
