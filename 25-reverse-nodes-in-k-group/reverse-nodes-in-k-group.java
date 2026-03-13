class Solution {
    ListNode rev (ListNode s , ListNode e){
        ListNode prev = null;
        ListNode temp;
        while(s!=e){
            temp=s.next;
            s.next = prev;
            prev = s;
            s = temp;
        } s.next =prev;
      
    return s;}

    public ListNode reverseKGroup(ListNode head, int k) {
        if( head==null || head.next==null || k==1) return head;
        ListNode s = head , e = head;
        int epos = k-1;
        while(epos-->0){
            e = e.next;
            if(e == null) return head;
        }
        ListNode ans = reverseKGroup(e.next,k);
        rev(s,e);
        s.next=ans;
        return e;
    }
}