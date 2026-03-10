class Node{    
    int data;
    Node next;   //like singly linked list so no need of prev part
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class CircularLLOperations{
    private static Node head=null;
    public static void insertAtEnd(int data){ /*inserting data at end*/
        Node newNode=new Node(data); 
        if(head==null){
            head=newNode;//after adding a node
            newNode.next=head; //untill next node comes it will be head and tail like that 
            return;
        }
        Node temp=head;
        while(temp.next!=head){  //because again head value should not be given to next as it is circularlinked list
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    public static void insertAtFirst(int data){ //inserting data at first
      Node newNode=new Node(data);
      if(head==null){
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
    public static void insertAtParticularPosition(int data,int position){    //inserting at particular index
      Node newNode=new Node(data);
      if(position==1){
        insertAtFirst(data);
        return;
      }
      Node temp=head;
      for(int i=1;i<position-1;i++){  // as we know the no.of positions we iterate untill that and add node there
        temp=temp.next;
        if(temp==head){  //for terminating loop at the end point
         return;
        }
    }
        newNode.next=temp.next;
        temp.next=newNode;
      
    }
    public static void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == head){
            head = null;
            return;
        }

        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    public static void deleteAtEnd(){  //deleting at end
      if(head==null){
        System.out.println("list is empty");
        return;
       }
      if(head.next==head){   // if(head.next==head) can also be placed
        head=null;
        return;
      }
      Node temp=head;
      while(temp.next.next!=head){
        temp=temp.next;
      }
      temp.next=head;
    }
    public static void deleteAtParticularPosition(int position){  //deleting at particular index
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    if(head.next==head){  //single node check
        head=null;
        return;
    }
    Node temp=head;
     int count=0;
     while(count<position-1 && temp.next!=head){ //Traverse to (position-1)'th node
        temp=temp.next;
        count++;
     }
     if(temp.next==head){  //out of bounds condition
      System.out.println("position out of bounds!");
      return;
     }
     temp.next=temp.next.next; //delete the node
    }
    public static void display(){    //only one way to display i.e., forward traversaland  no reverse traversal
       if(head==null){
        System.out.println("list is empty");
        return;
       }
       Node temp=head;
       do{ //do while to perform atleast one condition
        System.out.print(temp.data+" -> ");
        temp=temp.next;  //updation 
       }while(temp!= head); //condition to stop
       System.out.println("back to end");  
    }
}
public class singularcircularlinkedlist {
    public static void main(String[] args) {
        CircularLLOperations.insertAtEnd(10);
        CircularLLOperations.insertAtEnd(20);
        CircularLLOperations.insertAtEnd(30);
        CircularLLOperations.insertAtEnd(40);
        CircularLLOperations.insertAtFirst(17);
        CircularLLOperations.insertAtFirst(15);
        System.out.println("After insertion:");
        CircularLLOperations.display();

        CircularLLOperations.insertAtParticularPosition(60,3);
        System.out.println("After insertion at particular position:");
        CircularLLOperations.display();

        CircularLLOperations.deleteAtFirst();
        System.out.println("After deletion at first:");
        CircularLLOperations.display();

        CircularLLOperations.deleteAtEnd();
        System.out.println("After deletion at end:");
        CircularLLOperations.display();

        CircularLLOperations.deleteAtParticularPosition(1);
        System.out.println("After deletion at particular position :");
         CircularLLOperations.display();


    }
}
