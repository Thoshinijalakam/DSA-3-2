class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ListOfFunctions{
    //another function
    static Node head;
    //global variable head
    public static void display(){
        Node temp=head;        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void addfirst(int data){ 
    //let us think linked list having values with 10,20,30,40 now 40 should swap with 10 how only still include that's all
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void insert(int data){//insert the data from begining or ending anywhere
        Node newNode=new Node(data);//to store data in new variable
        if(head==null){ //incase the head is not null
            head=newNode;
            return;//orhead=head.next-if not null then move to the next
        }
        Node temp=head;
        //already in head there will be data again if we insert error will come so we given a temp variable
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
}
public class Singly_linked_list_7{
public static void main(String[] args) {
       ListOfFunctions lf=new ListOfFunctions();
       lf.addfirst(10);
       lf.addfirst(20);
       lf.addfirst(30);
       lf.addfirst(40);
       lf.display();
    }
}