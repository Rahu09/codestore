package Tree.BinaryTree;
import java.util.*;

public class allTransversal {
    //  ----------------------------------------Node class(Datatype)----------------------------------------  //
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right=null;
        }
    }
    //  ----------------------------------------build tree (preorder)----------------------------------------  //
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void resetIdx(){
            idx=-1;
        }
    }

    //  ----------------------------------------Tree Traversals----------------------------------------  //
    // ...Here pre, In & post shows the position of root being called (compare to left & right child)... //
    // Depth first search (DFS) algorithm. //

    //  a. Preorder :::::: (root -> left -> right)
    public static void preorder(Node root){
        if(root==null){
//            System.out.print("(-1) ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //  b. Inorder :::::: (left -> root -> right)
    public static void Inorder(Node root){
        if(root==null){
//            System.out.print("(-1) ");
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }


    //  c. Postorder :::::: (left -> right -> root)
    public static void Postorder(Node root){
        if(root==null){
//            System.out.print("(-1) ");
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    //  d. LevelOrder :::::: (Level 1 -> Level 2 -> Level 3 -> .... )
    // breath first search (BFS) algorithm. //
    public static void LevelOrder(Node root){
        if (root==null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();

            if(curr==null){
                System.out.println();

                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }else{
                System.out.print(curr.data+" ");

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }
        }
    }

    //  ----------------------------------------Questions----------------------------------------  //
    //  here in most question we will find left & right child solution for given question
    //  and then do the operation on them to obtain the root's solution.

    //  -------------------------------------------------1. Count the no of nodes.
    public static int countNodes(Node root) {
        if(root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }

    //  --------------------------------------------------2. Height of tree.
    public static int height(Node root) {
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }

    //  --------------------------------------------------3. Sum of nodes.
    public static int sumOfNodes(Node root) {
        if(root == null){
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left+right+ root.data;
    }

    //  -----------------------------------------------4. Diameter of tree(TC -> O(N^2)).
    public static int diameter1(Node root){
        if (root == null){
            return 0;
        }
        int diam1 = height(root.right)+height(root.left)+1;
        int diam2 = diameter1(root.left);
        int diam3 = diameter1(root.right);
        return Math.max(Math.max(diam1,diam2),diam3);
    }

    //  ----------------------------------------------5. Diameter of tree(TC -> O(N)).
    public static class TreeInfo{
        int height;
        int diam;
        TreeInfo(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }
    public static TreeInfo diameter2(Node root){
        if (root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int diam1 = left.height+ right.height+1;
        int diam2 = left.diam;
        int diam3 = right.diam;

        int myDiam =  Math.max(Math.max(diam1,diam2),diam3);
        int myHeight = Math.max(left.height, right.height)+1;

        return new TreeInfo(myDiam,myHeight);
    }

    //  -------------------------------------------------6. Identical Tree check(TC -> O(N)).
    public static boolean isIdentical(Node root, Node root2) {
        if (root == null && root2 == null) {
            return true;
        }
        if (root == null || root2 == null) {
            return false;
        }
        if (root.data == root2.data) {
            return isIdentical(root.left,root2.left) && isIdentical(root.right, root2.right);
        }
        return false;
    }

    //  ------------------------------------------------7. Subtree of another tree(TC -> O(N)).
    public static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data)
            if(isIdentical(root,subRoot)) return true;

        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
    }
    static int maxdiff=0;
    static public boolean isBalanced(Node root) {
        if(root == null) return true;
        diff(root);
        int temp=maxdiff;
        if(temp>1) return false;
        return true;
    }
    static public int diff(Node root){
        if(root == null) return 0;

        int diff1 = diff(root.left);
        int diff2 = diff(root.right);

        if(maxdiff<Math.abs(diff1-diff2)) maxdiff=Math.abs(diff1-diff2);
        return Math.max(diff1,diff2)+1;
    }

    //  ----------------------------------------Main Method----------------------------------------  //
    public static void main(String[] args) {

        //  creating a tree
//        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] nodes = {1,2,3,4,-1,-1,4,-1,-1,3,-1,-1,2,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(isBalanced(root));

//        //  creating a subtree
//        int[] nodes1 = {2, 4, -1, -1, 5, -1, -1};
//        BinaryTree.resetIdx();
//        Node subRoot = BinaryTree.buildTree(nodes1);
//
//        System.out.println("LevelOrder print of Tree1");
//        LevelOrder(root);
//        System.out.println();
//        System.out.println("LevelOrder print of Tree2");
//        LevelOrder(subRoot);
//        System.out.println();
//        preorder(root);
//        System.out.println("preorder print of Tree1");
//        Inorder(root);
//        System.out.println("Inorder print of Tree1");
//        Postorder(root);
//        System.out.println("Postorder print of Tree1");
//        System.out.println();
//
//        System.out.println("No of Nodes are = " + countNodes(root));
//        System.out.println("Height of tree is = " + height(root));
//        System.out.println("sum of nodes is = " + sumOfNodes(root));
//        System.out.println("diameter of tree is = " + diameter1(root));
//        System.out.println("diameter of tree is = " + diameter2(root).diam);
//        System.out.println("Tree2 is subTree of Tree1 = " + isSubtree(root,subRoot));
    }
}
