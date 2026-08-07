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
    public ListNode reverseList(ListNode head) {
         if(head==null)
        {
            return head;
        }
        
        ListNode prev=null;
        ListNode n=head.next;

        while(n!=null)
        {
            head.next=prev;
            prev=head;
            head=n;
            n=head.next;
        }

        head.next=prev;

        return head;
        
    }
}