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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // 1. finding middle element
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        ListNode curr =slow;
        ListNode prev = null;
        //2. reverese the half of it
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // prev is the head of the reversed half linked list (the list is individual)
        // now add
        int max =0;
        while(prev!=null){
            if((prev.val+head.val)>max) max = prev.val+head.val;
            prev=prev.next;
           head= head.next;
        } 

     return max;  }
}