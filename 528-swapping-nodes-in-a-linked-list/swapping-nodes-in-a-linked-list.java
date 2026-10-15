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
       int n =0;
       ListNode temp = head;
       while(temp!=null){
            temp = temp.next;
            n++;
       } 
       int find = n-k;
       temp = head;
       ListNode temp2 = head;
       for(int i =0;i<k-1;i++){
            temp= temp.next;
       }
       for(int i =0;i<find;i++){
        temp2=temp2.next;
       }
       int swap = temp2.val;
       temp2.val = temp.val;
       temp.val = swap;
       return head;
    }
}