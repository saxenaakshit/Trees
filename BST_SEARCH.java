package trees.com;

public class BST_SEARCH {
    // function to search a node in BST
    boolean Search(Node root, int x) {
        if (root == null) return false;
        if (root.data == x) {
            return true;
        }
        if (root.data > x) {
            return Search(root.left, x);
        }
        return Search(root.right, x);

    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

