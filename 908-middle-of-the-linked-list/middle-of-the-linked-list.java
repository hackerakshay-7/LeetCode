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
    public ListNode middleNode(ListNode head) {
     ListNode temp = head;
     int size=0;
     while(temp!=null){size++; temp=temp.next;}
     ListNode temp2= head;
     if(size%2==0){ for(int i =0;i<size/2;i++){temp2=temp2.next;} return temp2;}
     else{ for(int i=0;i<size/2;i++){temp2=temp2.next;}return temp2;}
     
    }
}