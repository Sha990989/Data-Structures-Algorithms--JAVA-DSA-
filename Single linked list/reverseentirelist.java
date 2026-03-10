/*create a function to reverse a singly linked list 
logic: Swapping Numbers*/


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ListOfFunctions{
    static Node head;//global variable
    public static void display(){   //for display no inputs we give
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
      }
      System.out.println("null");
    }
    public static void addfirst(int data){  //adds the node data at the beginning  
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void insert(int data){   //insertion operation
        Node newNode=new Node(data);
        if(head==null){
            head = newNode;
            return;
            
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    public static void reverse(){  //reversing entire list
     Node prev=null;
     Node current=head;
     Node next;
     while(current!=null){  
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    head=prev;
}
}
public class reverseentirelist {
    public static void main(String[] args) {
        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);

        System.out.println("Original List:");
        ListOfFunctions.display();

        ListOfFunctions.reverse();

        System.out.println("Reversed List:");
        ListOfFunctions.display();

        
    }
}
