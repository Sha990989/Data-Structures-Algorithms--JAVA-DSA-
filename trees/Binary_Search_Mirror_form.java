//write a program to print binary search tree in mirror form//
class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class BinarySearchTree {
    Node root = null;
    // Insert node
    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    public Node mirror(Node root) {
        if (root == null) return null;
        // Swap left and right
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Mirror subtrees
        mirror(root.left);
        mirror(root.right);
        return root;
    }
}
public class Binary_Search_Mirror_form{
        public static void main(String [] args){
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {18, 12, 24, 6, 15, 20, 30};
        for (int i : arr){
            bst.root = bst.insert(bst.root, i);
        }
        System.out.println("Original Inorder:");
        bst.inorder(bst.root);
        bst.root = bst.mirror(bst.root);
        System.out.println("\nMirror Inorder:");
        bst.inorder(bst.root);
    }
}