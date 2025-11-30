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
    public String search(Node root,int value){
        if(root==null){
            return "no data";
        }
        if(root.data==value){
            return "found in root";
        }
        if(value<root.data){
            return search(root.left, value);
        }else{
            return  search(root.right, value);
        }
    }
    public int findMinValue(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }
    public int findMaxValue(Node root){
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }
    public void delete(){//whole root will delete
        if(root==null){
            return;
        }
        root = null;
    }
    public  Node deleteValue(Node root,int value){
        if(root == null){
            return null;
        }
        if(root.data<value){//3 conditions 1*no edges 2*one edge 3*two edges
            root.right=deleteValue(root.right,value);
        }else if(root.data > value){
            root.left=deleteValue(root.left,value);    
        }else{
        if(root.left == null && root.right == null){
            return null;
        }
        if(root.left == null){
            return root.right;
        }if(root.right == null){
            return root.left;
        }
        int min=findMinValue(root.right);
        root.data=min;
        root.right=deleteValue(root.right, min);
        }
        return root;
    } 
    public void Mirror(Node root){ //swap left to right and right to left
        if(root==null)
            return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
public class Binary_search_tree1_9{
    public static void main(String[] args) {
        BinarySearchTreeMethods bstm=new BinarySearchTreeMethods();
        int[]arr={5,6,7,5,3,2,1,0};
        for(int i:arr){
            bstm.root=bstm.insertion(bstm.root,i);
        }
        bstm.inOrder(bstm.root);
        System.out.println(bstm.search(bstm.root,7));
        System.out.println(bstm.findMinValue(bstm.root));
        System.out.println(bstm.findMaxValue(bstm.root));
        //bstm.delete();
        //System.out.println();
        bstm.root=bstm.deleteValue(bstm.root, 7);
        bstm.inOrder(bstm.root);
        System.out.println();
        bstm.Mirror(bstm.root);
        bstm.inOrder(bstm.root);
    }
}