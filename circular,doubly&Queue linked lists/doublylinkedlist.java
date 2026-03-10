class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.prev=prev;
        this.data=data;
        this.next=null;
    }
}
class DoublyLLOperations{
private  static Node head=null;
private static Node tail=null;
public static void addEnd(int data){      //insertion function(at first)
//public void insert(int data)   
    Node newNode=new Node(data);
    if(tail == null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;   //inserting at last => tail next will be new node that is we are adding at last 
    newNode.prev=tail;   //and then new node previous will be tail
    tail=newNode;  //updating new node as tail
}
public  static void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head; //new node next will be head  (as we are adding node at first and already existing first node will be head untill we add the new node )
    head.prev=newNode;  //head previous will be new node ( and if we add node at first then new node becomes head)
    head=newNode;//updating new node as head
}
public static void forwardtraversal(){
    Node temp=head;
    while(temp!= null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");

}
public static void backwardtraversal(){
    Node temp=tail;
    while(temp!= null){
        System.out.print(temp.data+"->");
        temp=temp.prev;
    }
    System.out.println("null");
}
public static void deleteEnd(){
    if(tail ==null){
        System.out.println("list is empty");
        return;
    }
    tail=tail.prev; //for breaking forward traversal and upodating tail
    if(tail!=null){
      tail.next=null; //for breaking backward traversal
    }
    else{
        head=null;  // if that is the last element then head will be null
    }
}
public static void deleteFirst(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    head=head.next;//for breaking backward traversal and updating head
    if(head!=null){
        head.prev=null;//After moving the head, the new head might still have a prev pointer pointing to the old deleted node  So we break that link
    }
    else{
        tail=null;//if that is the last element then tail will be null then head = null and tail = null

    }
}
}
public class doublylinkedlist {
    public static void main(String[] args) {
        DoublyLLOperations.addFirst(50);
        DoublyLLOperations.addFirst(70);
        DoublyLLOperations.addEnd(20);
        DoublyLLOperations.addEnd(30);
        DoublyLLOperations.addEnd(40);
        System.out.println("Forward traversal:");
        DoublyLLOperations.forwardtraversal();
        System.out.println("Backward traversal:");
        DoublyLLOperations.backwardtraversal();
        System.out.println("After deletion at end :");
        DoublyLLOperations.deleteEnd();
        DoublyLLOperations.forwardtraversal();  //forward traversal after deletion at end 
        System.out.println("After  deletion at first :");
        DoublyLLOperations.deleteFirst();
        DoublyLLOperations.forwardtraversal();  
    }
}
