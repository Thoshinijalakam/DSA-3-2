class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SingleCircularMethods{
    private Node head=null;
    public void deleteFirst(){
        if(head == null){
             System.out.println("List is empty");
        return;    
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next!=head) {
            temp=temp.next; 
        }
        head=head.next;
        temp.next=head;
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.next==head)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }
    public void deleteposition(int pos){
        if(head==null){
            System.out.println("No Data");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        } 
        Node temp=head;
        int count=0;
        while(count<pos-1 && temp.next!=head){
            temp=temp.next;
            count++;
        }
        if(temp.next==head){
            System.out.println("position out of bounds!");
            return;
        }        
        temp.next=temp.next.next;
    }
    public void insertingAtEnd(int data){
       Node newNode=new Node(data);
       if(head == null){
         head = newNode;
         newNode.next=head;
         return;
       }
       Node temp=head;//if data is there
       while(temp.next!=head){
        temp=temp.next;
       }
       temp.next = newNode;  // last node should point to newNode
       newNode.next = head;  // newNode should point to head
    }
    public void display(){
       if(head==null){
        System.out.print("no data.");
        return;
       }
       Node temp=head;
       do{
            System.out.print(temp.data+" ->");
             temp = temp.next;
        } while (temp!=head);
        System.out.println();
    }
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
    }
    public void insertByPosition(int data,int pos){
        Node newNode=new Node(data);
        if(pos==1){
           insertFirst(data);
           return;
       }
       Node temp = head;
       for(int i=1;i<pos-1;i++){
        temp=temp.next;
        if(temp == head){
            return;
        }
       }
        newNode.next=temp.next;
        temp.next=newNode;
    }
}
public class Circular_linked_list_8{
     public static void main(String[] args) {
        SingleCircularMethods scm=new SingleCircularMethods();
        scm.insertingAtEnd(10);
        scm.insertingAtEnd(30);
        scm.insertingAtEnd(20);
        scm.display();
        scm.insertFirst(5);
        scm.insertFirst(2);
        scm.display();
        scm.insertByPosition(6, 2);
        scm.display();
        scm.deleteFirst();
        scm.display();
        scm.deleteEnd();
        scm.display();
        scm.deleteposition(2);
        scm.display();
    }
}