package Tree.BinarySearchTree;

import java.util.ArrayList;

public class BSTBasics {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) { this.data=data; }
    }
    public static void Inorder(Node root){
        if(root==null) return;

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    
    //  ------------------------------- Insertion -------------------------  //
    public static Node insert(Node root, int value){
        if(root==null){
            return new Node(value);
        }
        if (root.data > value)
            root.left = insert(root.left,value);
        else
            root.right = insert(root.right,value);

        return root;
    }
    
    //  ------------------------------- Search --------------------------  //
    public static boolean search(Node root, int value) {
        if (root == null) {
            return false;
        } else if (root.data == value) {
            return true;
        } else if (root.data > value) {
            return search(root.left, value);
        }else{
            return search(root.right, value);
        }
    }

    //  ------------------------------- Inorder Successor( next term in inorder transversal ) --------------------------  //
    public static Node inOrderSuccessor(Node root) {
        if (root==null) {
            return null;
        }
        root = root.right;
        while (root.left != null) {
            root=root.left;
        }
        return root;
    }

    //  ------------------------------- Deletion --------------------------  //
    public static Node delete(Node root, int value) {
        if (root.data > value) {
            root.left = delete(root.left,value);
        }
        else if (root.data < value) {
            root.right = delete(root.right, value);
        }
        else {
            //case 1
            if (root.left == null && root.right == null) {
                return root;
            }
            //case 2
            else if (root.left == null) {
                return root;
            }
            else if (root.right == null) {
                return root;
            }
            //case 3
            else{
                Node IS = inOrderSuccessor(root);
                root.data=IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }

    //  ------------------------------- Finding all root within the given range --------------------------  //
    public static void findInRange(Node root, int low, int high) {
        if(root==null)
            return;

        if (root.data >= low && root.data <= high) {
            findInRange(root.left, low, high);
            System.out.print(root.data+" ");
            findInRange(root.right, low, high);
        }
        else if (root.data >= high) {
            findInRange(root.left, low, high);
        }
        else{
            findInRange(root.right, low, high);
        }
    }

    //  ------------------------------- Printing all the paths from root to leaf --------------------------  //
    public static void printAllPath(Node root , ArrayList<Integer> list) {
        if (root == null)
            return;

        list.add(root.data);

        // leaf //
        if (root.left == null && root.right == null) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+"->");
            }
            System.out.println();
        } // non-leaf //
        else{
            printAllPath(root.left,list);
            printAllPath(root.right,list);
        }

        list.remove(list.size()-1);
    }


    public static void main(String[] args) {

        // ............................................creating tree //
        int[] values = {5,1,3,4,6,2,7};
        Node root = null;
        for (int i = 0; i < values.length; i++)
            root = insert(root, values[i]);

        Inorder(root); // ..............................printing tree //

        int key = 58; // key to be searched
        if ( search(root,key))// .......................searching in tree //
            System.out.println("found");
        else
            System.out.println("not found");

        System.out.println(delete(root,3).data);// .......................deletion in tree //

        Inorder(root);
        System.out.println();

        // .......................... Finding all root within the given range //
        findInRange(root,4,6);
        System.out.println();

        // ........................... Printing all the paths from root to leaf //
        printAllPath(root,new ArrayList<>());
    }
}
