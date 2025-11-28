class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class DoublyLinkedListMethods{
    private Node head;
    private Node tail;
    public void addEnd(int data){
        Node newNode=new Node(data);
        if(tail == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;//update
    }
    public void addFront(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head=newNode;//update
    }
    public void deletefrontone(){
        if(head==null){
            System.out.print("No data");
            return;
        }
        head=head.next;
        if(head!=null){
        head.prev=null;            
        }else{tail=null;    
        }
    }    
    public void deleteEndone(){
        if(tail==null){
            System.out.println("No data");
            return;
        }
        tail=tail.prev;
        if(tail!=null){
             tail.next=null;
        }else{
            head=null;
        }
    }    
    public void ForwardTraversal(){//forward traversal
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
            System.out.println("null");
    }
    public void BackwardTraversal(){//BackwardTraversal
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

}
public class Doubly_linked_list_8{
    public static void main(String[] args) {
        DoublyLinkedListMethods dlm=new DoublyLinkedListMethods();
        dlm.addFront(10);
        dlm.addFront(20);
        dlm.addFront(30);
        dlm.addFront(40);
        dlm.ForwardTraversal();
        dlm.addEnd(50);
        dlm.addEnd(60);
        dlm.ForwardTraversal();
        dlm.deleteEndone();
        dlm.ForwardTraversal();
        dlm.deletefrontone();
        dlm.ForwardTraversal();
        
    }
}