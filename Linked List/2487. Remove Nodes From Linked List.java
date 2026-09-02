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
    public ListNode removeNodes(ListNode head) {

        head=rev(head);
        
        ListNode curr=head;
        int max=curr.val;

        while(curr.next!=null)
        {
            if(curr.next.val>=max)
            {
                max=curr.next.val;
                curr=curr.next;
            }
            else
            {
                del(curr);
            }
        }

        head=rev(head);

        return head;

    }

    void del(ListNode temp)
    {
        temp.next=temp.next.next;
    }

    ListNode rev(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=head.next;

        while(next!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;

        return curr;
    }
}