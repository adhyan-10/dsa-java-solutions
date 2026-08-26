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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode next = slow.next;
        ListNode prev = null;
        ListNode h2=slow;

        while(next!=null)
        {
            h2.next=prev;
            prev=h2;
            h2=next;
            next=next.next;
        }
        h2.next=prev;

        ListNode t1=head;
        ListNode t2=h2;
        boolean flag=true;

        while(t1!=null && t2!=null)
        {
            if(t1.val != t2.val)
            {
                flag=false;
                break;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return flag;
    }
}