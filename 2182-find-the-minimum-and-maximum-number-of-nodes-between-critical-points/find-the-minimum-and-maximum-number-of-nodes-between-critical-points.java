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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int a = Integer.MAX_VALUE;
        int ans = 1;
        ListNode next = head.next;
        ListNode prev = null;
        ListNode curr = head;
        int first = -1;
        int last = -1;
        int pv =-1;
        while (next!= null) {
            if (prev != null && next != null) {
                if ((next.val > curr.val && prev.val > curr.val) || (next.val < curr.val && prev.val < curr.val)){
                    if(first == -1) first =ans;
                    else{ last = ans;}
                    if(pv==-1) pv=ans;
                    else{ a =Math.min(a,ans-pv); pv = ans;}
                    }
            }
            prev=curr;
            next = next.next;
            curr= curr.next;
            ans++;
        }
        if(last==-1) return new int[]{-1,-1};
   
   return new int [] {a,last-first}; }
}
/**
 Collections.sort(list);
    int a = list.get(list.size()-1)-list.get(0);
    int b = list.get(list.size()-1)-list.get(list.size()-2); */