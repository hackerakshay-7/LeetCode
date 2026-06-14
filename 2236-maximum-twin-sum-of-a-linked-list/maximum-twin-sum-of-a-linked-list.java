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
        int max=Integer.MIN_VALUE;
       Stack<Integer> st = new Stack<>();
       ListNode temp=head;
       while(temp!=null){
        st.push(temp.val);
        temp=temp.next;
       }
       int n = st.size();
       for(int i=0;i<n/2;i++){
        max=Math.max(max,(st.pop()+head.val));
        head=head.next;
       }
    return max;}
}