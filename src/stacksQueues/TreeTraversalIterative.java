package stacksQueues;

import java.util.*;

public class TreeTraversalIterative {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node curr = root;
        curr.left = new Node(2);
        curr.right = new Node(3);
        curr = curr.left;
        curr.left = new Node(4);
        curr.right = new Node(5);
        System.out.println("inorder" + inOrder(root));
        System.out.println("preorder" + preOrder(root));
    }
    static class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    // Return a list containing the inorder traversal of the given tree
    /*
Input:
           1
         /    \
       2       3
      /   \
    4     5
Output: 4 2 5 1 3
Explanation:
Inorder traversal (Left->Root->Right) of
the tree is 4 2 5 1 3.
*/
    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(!st.isEmpty() || curr!=null){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                curr = st.pop();
                list.add(curr.data);
                curr = curr.right;
            }
        }
        return list;
    }
    // Return a list containing the Preorder traversal of the given tree
 /*
    Input:
           1
         /   \
        2     3
      /  \
     4    5
Output: 1 2 4 5 3
Explanation:
Preorder traversal (Root->Left->Right) of
the tree is 1 2 4 5 3.
*/
    public static ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;

        while(!st.isEmpty() || curr!=null){
            if(curr!=null){
                list.add(curr.data);
                st.push(curr);
                curr=curr.left;
            }else{
                curr = st.pop();
                curr = curr.right;
            }
        }
        return list;
    }
}
