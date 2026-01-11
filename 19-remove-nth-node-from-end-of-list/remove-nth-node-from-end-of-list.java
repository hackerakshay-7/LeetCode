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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null) return null;
        ListNode temp = head ; int i =1;
        while( temp.next!=null){i++; temp=temp.next;}
        temp=head; ListNode temp2=head.next.next;
        n=i-n;
        if(n==0) return head.next;
      for(int k =0;k<n-1;k++){ temp=temp.next; temp2=temp2.next;}
        temp.next=temp2;

    return head;}
}