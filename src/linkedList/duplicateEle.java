package linkedList;

public class duplicateEle {
    public static class Node {
        Node head;
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }

        public void add(int value){
            Node node =new Node(value);
            if(head==null){
                head=node;
                return;
            }
            Node temp=head;
            while (temp.next!=null)
                temp=temp.next;
            temp.next=node;
        }
        public void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("end");
        }
    }


    public static void main(String[] args) {
        Node ll = new Node();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.display();
        deleteDuplicates(ll.head);
        ll.display();
    }
    public static Node deleteDuplicates(Node head) {
        if(head==null)
            return head;

        Node ind=head, temp = head;
        while(ind!=null){

            if(temp.val!=ind.val){
                temp.next=ind;
                temp=ind;
            }
            ind = ind.next;
        }
        temp.next=null;
        return head;
    }
}
