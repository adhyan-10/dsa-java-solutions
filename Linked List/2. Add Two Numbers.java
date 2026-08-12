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
    ListNode head = null;
    ListNode tail = null;
    int carry = 0;

    public void add(int sum) {

        int value = (sum + carry) % 10;
        if (head == null) {
            head = new ListNode(value);
            tail = head;
        } else {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        if ((sum + carry) > 9) {
            carry = 1;
        } else {
            carry = 0;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        while (l1 != null && l2 != null) {
            add((l1.val + l2.val));
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {

            add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            add(l2.val);
            l2 = l2.next;
        }

        if (l1 == null && l2 == null && carry == 1) {
            tail.next = new ListNode(carry);
            tail = tail.next;
        }

        return head;

    }
}