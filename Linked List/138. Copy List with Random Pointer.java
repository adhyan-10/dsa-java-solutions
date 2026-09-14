/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        {
            return null;
        }

        HashMap<Node,Node> h1=new HashMap<>();

        Node t1=head;
        Node h2= new Node(head.val);
        Node t2=h2;


        while(t1.next!=null)
        {
            t2.next=new Node(t1.next.val);
            h1.put(t1,t2);
            t2=t2.next;
            t1=t1.next;
        }
        
        h1.put(t1,t2);
        t1=head;
        t2=h2;

        while(t1!=null)
        {
            t2.random=h1.get(t1.random);
            t2=t2.next;
            t1=t1.next;
        }

        return h2;

    }
}