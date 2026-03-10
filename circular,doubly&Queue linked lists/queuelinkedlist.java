//we need two global variables front,rear
//it is linked list containing two parts like linked list =>data part and next part
//in method we will have local variables and class has global variables
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueFunctions{
    private static Node front=null;//global variable
    private static Node rear=null;//global variable

    public static void enqueue(int data){  //insertion function(at first)
        Node newNode=new Node(data);
        if(rear==null){ //we will add data at the last so first we need to check rear 
            front=rear=newNode;
            return;
        }
        rear.next=newNode;  //inserting at last
        rear=newNode;
        }
    public  static void deQueue(){ //deletion function(at first)      
        if(front==null){
        System.out.println("queue is empty");   
            return ;
        }
    front=front.next;
    if(front == null){
        rear=null;
    }
    }
    public  static void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void frontValue(){
        if(front==null){
            System.out.println("queue is empty");
        }
        System.out.println("front value is:"+front.data);
    }
}
class queuelinkedlist{
    public static void main(String[] args) {
       QueueFunctions.enqueue(10);
       QueueFunctions.enqueue(20);
       QueueFunctions.enqueue(30);
       QueueFunctions.enqueue(40);
       QueueFunctions.display();
       QueueFunctions.frontValue();
       QueueFunctions.deQueue();
       System.out.println("After deletion:");
       QueueFunctions.display();
       QueueFunctions.frontValue();
    }
}