// package DSA_Coding_Thinker.Adavance_DSA.Trees;
class Binary_Tree {
    static class Node{
        int data;
        Node left,right;
        Node(int data) { // cunstructer to int types of data.
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }
    static class BinaryTree{
      static int idx=-1;
        public Node build(int []arr){
            idx++; // First Position to 0 Index Bassed.Because index =-1;
            if(arr[idx]==-1){ // if  idx =-1 is the data is null. thus Position.
                return null;
            }
            // Pre-order binary tree.  (Node-Left-Right).
            
            // Node newNode=new Node(arr[idx]); // newNode Create.
            // System.out.print(newNode.data+" ");
            // newNode.left=build(arr);
            // newNode.right=build(arr);
            // return newNode;

            // In-order in  Binary.(Left-Node-Right).

            // Node newNode=new Node(arr[idx]); // newNode Create.
            // newNode.right=build(arr);
            // newNode.left=build(arr);
            // System.out.print(newNode.data+" ");
            // return newNode;

            // Post-order binary tree.(Left-Right-Node).
            
            Node newNode=new Node(arr[idx]); // newNode Create.
            newNode.left=build(arr);
            System.out.print(newNode.data+" ");
            newNode.right=build(arr);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,4,8,-1,-1,-1,5,-1,-1,3,6,-1,9,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(arr);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
    }
}

