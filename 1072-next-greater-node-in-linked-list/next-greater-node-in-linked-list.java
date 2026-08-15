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
        ListNode prev =null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev = curr;
           curr=next;
        }
        return prev;
    }

    public int[] nextLargerNodes(ListNode head) {
        // kevin is young dumb and broke 🎤🎧🎶
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        ListNode h = rev(head);
        ListNode temp = h ;
        while(temp!=null){
            if(st.isEmpty()) list.add(0);
            else{
                while(!st.isEmpty() && st.peek()<=temp.val) {st.pop();}
                if(!st.isEmpty())list.add(st.peek());
                else{ list.add(0);}
            }
            st.push(temp.val);
            temp=temp.next;
        }
        int ans [] = new int[list.size()];
        int j =0;
        for(int i = list.size()-1;i>=0;i--){
            ans[j] = list.get(i);
            j++;
        }
   return ans; }
}