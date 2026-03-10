/* Stack using linked list*/
/* Stack using linked list*/
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class StackFunctions{
    private static Node top; //global variable

    public static void push(int data){  //insertion into stack
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public static void pop(){  //deletion from stack
        if(top == null){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    public static void peek(){   //view the top
        if(top == null){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Top element: " + top.data);//prints the top element
    }

    public static void display(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Stackusinglinkedlist {
    public static void main(String[] args) {

        StackFunctions.push(10);
        StackFunctions.push(70);
        StackFunctions.push(50);
        StackFunctions.push(20);
        StackFunctions.push(30);

        System.out.print("Original stack: ");
        StackFunctions.display();

        StackFunctions.pop();   // FIXED
        System.out.print("After deletion stack: ");
        StackFunctions.display();

        StackFunctions.peek();

        System.out.print("Current stack: ");
        StackFunctions.display();
    }
}
