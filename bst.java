package trees.com;

// Function to insert a node in a BST
public class bst{
    Node insert(Node root, int key) {
            if (root == null) return new Node(key);
            if (root.data > key) {

            }
            if (root.data > key) {
            return insert(root.left, key);

            }
            return insert(root.right, key);

            }

static class Node {
    Node left, right;
    long data;


    public Node(int data) {
        this.data = data;

    }
}

    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // root.data = minValue(root.right);
            // root.right = deleteNode(root.right, root.data);
        }

        return root;

    }
}