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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int a = l1.val;
            int b = l2.val;
            temp.next = new ListNode((a + b + carry) % 10);
            carry = (a + b+carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        if (l1 == null && l2 != null) {
            while (l2 != null) {
                temp.next = new ListNode((l2.val + carry) % 10);
                carry = (l2.val + carry) / 10;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l2 == null && l1 != null) {
            while (l1 != null) {
                temp.next = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
                temp = temp.next;
                l1 = l1.next;
            }
        }
        if(carry!=0) { temp.next=new ListNode(carry); }
        return ans.next;
    }
}