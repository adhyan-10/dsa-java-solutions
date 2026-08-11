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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec=slow.next;
        slow.next = null;

        if(sec==null)
        {
            return;
        }

        ListNode n=sec.next;

        while(n!=null)
        {
            sec.next=prev;
            prev=sec;
            sec=n;
            n=sec.next;
        }
        sec.next=prev;
        
        ListNode temp = head;
        while(temp!=null && sec!=null)
        {
            sec.next=temp.next;
            temp.next=sec;
            temp=sec.next;
            sec=prev;
            if(sec!=null)
            {
                prev=sec.next;
            }
        }
    }
}