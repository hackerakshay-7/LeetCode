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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // it feels illegal ----->>>  my name is pink and im really glad to meet uh!!!

        ListNode ans = new ListNode(1);
        ListNode temp = ans;
       // ans.head=1;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){ temp.next=list2; temp = temp.next; list2=list2.next;}
            else{ temp.next=list1; list1=list1.next; temp=temp.next;}}
            if(list1!=null){temp.next=list1;}
            else{ temp.next=list2;}
      return ans.next;}
}