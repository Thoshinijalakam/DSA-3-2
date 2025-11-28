class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ListOfFunctions{
    private Node front = null;
    private Node rear = null;
    public void enQueue(int data){ //this is adding function
        Node newNode = new Node(data);
        if(rear == null){
            rear=front=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public void deQueue(){//delete the front data
        if(front == null){
            System.out.println("it is empty");
            return;
        }
        front=front.next;
        if(front == null){
            rear = null;
        }
    }
    public void display(){//display the operations
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
            System.out.println("null");
    }
    public void front(){//it will give the front value
        if(front!=null){
            System.out.print("Element is: "+front.data);
            return;
        }
            System.out.println("null");
    }
    }
public class Queue_8{
    public static void main(String args[]){
        ListOfFunctions lf=new ListOfFunctions();
        lf.enQueue(10);
        lf.enQueue(20);
        lf.enQueue(30);
        lf.enQueue(40);
        lf.display();
        lf.deQueue();
        lf.display();
        lf.front();
        lf.display();

    }
}