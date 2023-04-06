package stacksQueues;

import java.util.*;
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
public class InorderTraversalIterative {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node curr = root;
        curr.left = new Node(2);
        curr.right = new Node(3);
        curr = curr.left;
        curr.left = new Node(4);
        curr.right = new Node(5);
        System.out.println(inOrder(root));
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
}
