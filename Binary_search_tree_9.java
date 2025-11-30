class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTreeMethods{
    Node root = null;
    public Node insertion(Node root,int data){//insetion to the left or to the right
        if(root==null){
            return new Node(data);
        }
        if(root.data>data){
            root.left = insertion(root.left,data);
        }else{
            root.right=insertion(root.right,data);

        }
        return root;
    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
    public class Binary_search_tree_9{
        public static void main(String[] args) {
            BinarySearchTreeMethods bstm=new BinarySearchTreeMethods();
            bstm.root=bstm.insertion(bstm.root,20);
            bstm.root=bstm.insertion(bstm.root,12);
            bstm.root=bstm.insertion(bstm.root,10);
            bstm.root=bstm.insertion(bstm.root,25); 
            bstm.inOrder(bstm.root);
            System.out.println();
            bstm.preOrder(bstm.root);
            System.out.println();
            bstm.postOrder(bstm.root);
            System.out.println();
    }
}