/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                break;
            }
        }
        
        if(fast==null || fast.next==null)
        {
            return;
        }
        
        slow=head;
        
        if(slow==fast)
        {
            while(fast.next!=slow)
            {
                fast=fast.next;
            }
        }
        else
        {
             
            while(slow.next!=fast.next)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
       
        fast.next=null;
    }
}