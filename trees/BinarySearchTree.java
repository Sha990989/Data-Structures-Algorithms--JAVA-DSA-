class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{
    Node root=null;
    public Node insert(Node root,int data){
        if(root == null){   //if root is null 
           return new Node(data);  // we update root with new node data
        }
        if(root.data > data)  //for left side if data is less than root
        {
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);  //for right side if data is greater than root
        }
        return root;
    }
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
      public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public String search(Node root, int value){
    if(root == null){      //here root means tree
        return "not found";
    }

    if(root.data == value){      //here root means tree
        return "found in root";
    }

    if(value < root.data){      //here root means tree
        return search(root.left, value);
    } else {
        return search(root.right, value);
    }
}
public int minValue(Node root){
    while(root.left != null){      //here root means tree
        root=root.left;
    }
    return root.data;
}
public int maxValue(Node root){
    while(root.right!=null){  //here root means tree
        root=root.right;
    }
    return root.data;   
}
public void delete(){        //whole data in tree gets deletes
    if(root == null){
        return;
    }
    root=null;
}
public Node deleteByNode(Node root,int value){ //delete by value
    if(root == null){
        return null;
    }
    if(value<root.data){
        root.left=deleteByNode(root.left,value);
    }
    else if(value>root.data){
        root.right=deleteByNode(root.right,value);
    }
    else{ //found node

        // if no child
     if(root.left == null && root.right == null){
        root=null;
     }
     else if(root.left == null){ //if one child is present
        root=root.right;
     }
     else if(root.right == null){ //if one child is present
        root=root.left;
     }
     else{    //if two child is present
        int min=minValue(root.right);
        root.data=min;
        root.right=deleteByNode(root.right,min);
     }
    }
return root;
}
public void reflect(Node root ){  //mirror form of the tree
    if(root == null){
        return;
    } 
    Node temp=root.left;
    root.left=root.right;
    root.right=temp;
    reflect(root.left);
    reflect(root.right);
}
}
public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst=new BST();
        int[] arr={5,6,7,3,2,10};
        for(int i:arr){
            bst.root=bst.insert(bst.root,i);
        }
        /*bst.root=bst.insert(bst.root,15);
        bst.insert(bst.root,10);
        bst.insert(bst.root,20);
        bst.insert(bst.root,25);
        bst.insert(bst.root,8);
        bst.insert(bst.root,12);
        bst.insert(bst.root,17);*/

        System.out.println("tree root:"+bst.root.data);
        System.out.println("inorder:");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.println("preorder:");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.println("postorder:");
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println("value is found or not: "+bst.search(bst.root,10));
        System.out.println("minimum value is:"+bst.minValue(bst.root));
        System.out.println("maximum value is:"+bst.maxValue(bst.root));

       bst.deleteByNode(bst.root,3);
       System.out.println("inorder after deleting :");
       bst.inOrder(bst.root);
       System.out.println();
       
       bst.reflect(bst.root);
       System.out.println("inorder after reflecting :");
       bst.inOrder(bst.root);
       System.out.println();

    }
}
