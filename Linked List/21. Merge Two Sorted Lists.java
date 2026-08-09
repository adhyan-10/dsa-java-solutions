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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode head= new ListNode();
        ListNode temp=head;

        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                temp.next=new ListNode(t1.val,null);
                t1=t1.next;
            }
            else
            {
                temp.next=new ListNode(t2.val,null);
                t2=t2.next;
            }

            temp=temp.next;
        }
        
        while(t1!=null)
        {
            temp.next=new ListNode(t1.val,null);
            temp=temp.next;
            t1=t1.next;
        }

        while(t2!=null)
        {
            temp.next = new ListNode(t2.val,null);
            temp=temp.next;
            t2=t2.next;
        }
        head=head.next;
        return head;
        
    }
}