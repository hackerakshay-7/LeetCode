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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode temp= head;
       for(int i =1;i<k;i++){
        temp=temp.next;
       }
       ListNode first = temp;
       ListNode second = head;
       while(first.next!=null){
        first =first.next;
        second = second.next;
       }
       int swap = temp.val;
       temp.val = second.val;
       second.val = swap;
       return head;
    }
}