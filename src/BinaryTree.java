public class BinaryTree {

    Node root;

    public void insert(int data) {

        root = insertRec(root,data);

    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data)
            root.Left = insertRec(root.Left, data);
        else if (data > root.data)
            root.Right = insertRec(root.Right, data);

        return root;
    }

    public void inorder(){
        inorderRec(root);
    }
    public void inorderRec(Node root){
        if (root != null){
            inorderRec(root.Left);
            System.out.print(root.data + " ");
            inorderRec(root.Right);
        }
    }
}
