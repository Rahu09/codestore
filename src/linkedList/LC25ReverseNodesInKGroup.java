package linkedList;

public class LC25ReverseNodesInKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <= 5; i++) {
            ListNode n = new ListNode(i);
            temp.next = n;
            temp = n;
        }
        reverseKGroup(head,3);

        for (int i = 0; i < 5; i++) {
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null;
        ListNode one = head;
        ListNode two = head.next;

        while(true){
            if(!possible(one,k)) break;
            for(int i=0; i<k-1; i++ ){
                ListNode temp = two.next;
                two.next = one;
                one = two;
                two = temp;
            }
            if(pre == null){
                head.next = two;
                pre = head;
                head=one;
                one=two;
                if(one!=null && one.next!=null)two=one.next;
                else two = null;
            }else{
                ListNode temp = pre.next;
                pre.next = one;
                temp.next = two;
                pre = temp;
                one = two;
                if(one!=null && one.next!=null)two = one.next;
                else two = null;
            }
        }
        return head;
    }

    public static boolean possible(ListNode head, int k){
        if(head == null) return false;
        int ans =1;
        for(int i= 1; i<k; i++){
            if(head.next!=null){
                head = head.next;
                ans++;
            }else break;
        }
        return (ans == k) ? true:false;
    }
}
