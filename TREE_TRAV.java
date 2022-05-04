package trees.com;

import java.util.Scanner;
public class TREE_TRAV
{
    public static void main(String[] args) {
        Node root = CreateTree();
        CreateTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

    }
    static Node CreateTree(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");

        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left for"+ data);
        root.left = CreateTree();
        System.out.println("Enter right for"+data);
        root.right = CreateTree();
        return root;

    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");

    }
    static class Node{
        Node left, right;
        int data;


        public Node (int data){
            this.data=data;

        }
    }
}
