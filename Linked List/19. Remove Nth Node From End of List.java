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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }
        ListNode l=head;
        ListNode r=head;

        for(int i=0;i<n;i++)
        {
            r=r.next;
        }

        while(r!=null)
        {
            l=l.next;
            r=r.next;
        }
        ListNode temp=head;
        if(l.next==null)
        {
            while(temp.next!=l)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        else
        {
            l.val=l.next.val;
            l.next=l.next.next;
        }
        return head;
    }
}