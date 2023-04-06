package stacksQueues;

import java.util.*;

public class TreeTraversalIterative {
    static class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
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
        System.out.println("postorder via method 1" + postOrder(root));
        System.out.println("postorder via method 2" + postOrder2(root));
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
    /*Input:
                 1
               /   \
              2     3
            /  \
           4    5

    Output: 4 5 2 3 1
    Explanation:
    Postorder traversal (Left->Right->Root) of
    the tree is 4 5 2 3 1.*/
    public static ArrayList<Integer> postOrder(Node root) {
        Stack<Node> s=new Stack<>();
        ArrayList<Integer> ans= new ArrayList<Integer>();
        Node cur=root;
        s.push(cur);

        while(!s.isEmpty()) {
            cur=s.pop();
            ans.add(cur.data);
            if(cur.left!=null) s.push(cur.left);
            if(cur.right!=null) s.push(cur.right);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static ArrayList<Integer> postOrder2(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = node;
        while(!st.isEmpty() || curr!=null){
            if(curr!=null){
                list.add(curr.data);
                st.push(curr);
                curr = curr.right;
            }else{
                curr = st.pop();
                curr = curr.left;
            }
        }
        Collections.reverse(list);
        return list;
    }
}
