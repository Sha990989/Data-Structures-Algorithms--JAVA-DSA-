class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
       left=right=null;  //this.left and this.right  is not necessary as there is no data and data won't be swapped
    }
}
class BinaryTree{
 Node root;
 BinaryTree(){
    this.root=null;
 }
 public void inOrder(Node node){
    if(node == null){  //every time we check the node has data or not and then we will print
        return;
    }
    inOrder(node.left);
    System.out.print(node.data+" "); //we have data in node so node.data
    inOrder(node.right);  //we will fix to right
    }
    public void preOrder(Node node){
        if(node == null){  //every time we check the node has data or not and then we will print
        return;
    }
    System.out.print(node.data+" "); //we have data in node so node.data
    preOrder(node.left);
    preOrder(node.right);
 }
 public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left); // Fixed the typo here
        postOrder(node.right); // Fixed the typo here
        System.out.print(node.data + " ");
    }
 public int countOfNode(Node node){
    if(node == null){
        return 0;
    }
    return 1+countOfNode(node.left)+countOfNode(node.right);
 }
 public int findHeightOfTheTree(Node node){
    if(node ==  null){
        return 0;
    }
    return 1+Math.max(findHeightOfTheTree(node.left),findHeightOfTheTree(node.right));
 }
 public int sumOfNodes(Node node){
    if(node == null ){
        return 0;
    }
    return node.data+sumOfNodes(node.left)+sumOfNodes(node.right);
 }
 public int sumOfLeafNodes(Node node){
    if(node == null){
        return 0;
    }
    if(node.left==null && node.right==null){
        return node.data;
    }
    return sumOfLeafNodes(node.left)+sumOfLeafNodes(node.right);
    }
    
    public int deleteTree(Node node){       //delete a tree
        if(node == null){
            return 0;
        }
        node.left=null;
        node.right=null;
        return 1;
    }
 }

public class Binary_Tree{
    public static void main(String[] args) {

          BinaryTree tree=new BinaryTree();
        tree.root=new Node(1); //for inserting root node
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7); 

        System.out.println("inorder:");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("preorder:");
        tree.preOrder(tree.root);
        System.out.println();   

        System.out.println("postorder:");
        tree.postOrder(tree.root);
        System.out.println();

        System.out.println("Total number of nodes:"+tree.countOfNode(tree.root));
        System.out.println("height of tree:"+tree.findHeightOfTheTree(tree.root));
        System.out.println("sum of nodes:"+tree.sumOfNodes(tree.root));
        System.out.println("sum of leaf nodes:"+tree.sumOfLeafNodes(tree.root));
        
        tree.deleteTree(tree.root);
        System.out.println("Tree deleted successfully");
    }
}