package basic;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
public class PRIYAJOSH {
    public static void main(String[] args) {

    }
    static int c;
    public int consecutive_nodes_of_tree(TreeNode A) {
        c=0;
        count(A);
        return c;
    }
    public static void count(TreeNode A){
        if(A==null) return;
        if(A.left!=null && (A.left.val+1 == A.val || A.left.val-1 == A.val)) {
            c++;
        }
        if(A.right!=null && (A.right.val+1 == A.val || A.right.val-1 == A.val)) {
            c++;
        }
        count(A.left);
        count(A.right);
    }
}
