public class Solution {
    public ListNode detectCycle(ListNode head) { int count=0;
    if(head==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null){count++;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
            if(fast==null) break;
        }
                                                if(slow==fast && count>0){slow=head; while(fast!=slow){fast=fast.next;slow=slow.next;}return slow;}
    return null;}
}

 
