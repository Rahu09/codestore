package basic;

class Node{
    char val;
    Node next;
    public Node(char val){
//        this.next = next;
        this.val = val;
    }
}
public class priya3 {
    public static void main(String[] args) {
        Node head = new Node('a');
        Node temp = head;
        temp.next = new Node('b');
        temp=temp.next;
        temp.next = new Node('c');
        temp=temp.next;
        temp.next = new Node('a');
        temp=temp.next;
        temp.next = new Node('b');
        temp=temp.next;
        temp.next = new Node('c');
        temp=temp.next;
        temp.next = new Node('b');
        temp=temp.next;
        temp.next = new Node('b');
        temp=temp.next;
        System.out.println(strongest_password(head));
    }
    public static int strongest_password(Node head) {
        String str = "";
        while(head!=null){
            str=str+head.val;
            head=head.next;
        }
        int len = longestUniqueSubsttr(str);
        return len;
    }
    public static Boolean areDistinct(String str, int i, int j) {
        boolean[] visited = new boolean[26];
        for(int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;

            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
    public static int longestUniqueSubsttr(String str) {
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);

        return res;
    }

}
