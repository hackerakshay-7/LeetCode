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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
           
            ListNode prev = null;
            ListNode temp = slow;
            ListNode nxt = slow.next;
            while(nxt!=null){
                temp.next = prev;
                prev = temp;
                temp = nxt;
                nxt = nxt.next;   
            }
            temp.next=prev;
            slow = temp;


       while(head!=null && slow!=null){
            if(head.val!=slow.val) return false;
            head=head.next; slow = slow.next;
       }
       return true;
    }
}