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
    private ListNode rev(ListNode head){
        if(head==null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head.next;
        while(temp!=null){
            curr.next = prev;
            prev= curr;
            curr = temp;
            temp=temp.next;
        }
        curr.next = prev;
        return curr;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode a = rev(head);
        int carry =0;
        ListNode temp = a;
        while(temp!=null){
            int sum = (temp.val*2)+carry;
            temp.val=(sum)%10;
            carry = (sum)/10;
            if(temp.next==null && carry>0){temp.next=new ListNode(carry); break;}
            temp = temp.next;
        }
        head = rev(a);
   return head; }
}