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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        int length=0;
        ListNode temp1=head;
        while(temp1!=null)
        {
            temp1=temp1.next;
            length++;
        }
        temp1=head;
        int jump=k%length;

        for(int i=0;i<jump;i++)
        {
            temp1=temp1.next;
        }

        ListNode temp2=head;

        while(temp1.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }

        temp1.next=head;
        head=temp2.next;
        temp2.next=null;

        return head;

    }
}