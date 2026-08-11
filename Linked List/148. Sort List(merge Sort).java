/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null)
        {
            return head;
        }

        head=divide(head);

        return head;
    }

    public ListNode divide(ListNode start1)
    {
        if(start1.next==null)
        {
            return start1;
        }

        ListNode mid=middle(start1);
        ListNode start2=mid.next;
        mid.next=null;

        start1=divide(start1);
        start2=divide(start2);

        ListNode head=merge(start1,start2); 
        return head;         
    }

    public ListNode merge(ListNode s1,ListNode s2)
    {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        ListNode t1=s1;
        ListNode t2=s2;

        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                tail.next=t1;
                t1=t1.next;
            }
            else
            {
                tail.next=t2;
                t2=t2.next;
            }
            tail=tail.next;
        }

        while(t1!=null)
        {
            tail.next=new ListNode(t1.val);
            t1=t1.next;
            tail=tail.next;
        }

        while(t2!=null)
        {
            tail.next=new ListNode(t2.val);
            t2=t2.next;
            tail=tail.next;
        }

        return dummy.next;
    }

    public ListNode middle(ListNode start)
    {
        ListNode slow=start;
        ListNode fast=start.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}