/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null ||head.next==null || head.next.next==null) return false;
        ListNode slow=head.next;
        ListNode fast = head.next.next;
        while(fast!=null ){
            slow=slow.next;
           if(fast.next!=null) fast=fast.next.next;
            else{fast=fast.next;}
            if(slow==fast) return true;
        }
        
    return false;}
}