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
    public static void addfirst(int data){
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
}
public class singlylinkedlist {
    public static void main(String[] args) {
        ListOfFunctions sl=new ListOfFunctions();
        sl.insert(10);
        sl.insert(50);
        sl.insert(20);
        sl.insert(60);
        sl.addfirst(70);
        sl.display();

        
    }
}
