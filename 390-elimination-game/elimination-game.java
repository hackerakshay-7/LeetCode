class Solution {
    public int lastRemaining(int n) {
       // constraints are big need log n 
       // the answer is a single integer so we will make our head as the answer
       // the head is the starting element
       // the head only moves int two conditions
       // 1. we start from left 2.if num of elements are odd and we start from right
       // the head will be the ans 
       // the resulting sequence after removal is still an AP as common diff is constant over every iteration
       int head =1;
       int remain = n;
       int steps =1;
       boolean fromleft = true;
       while(remain>1){
        if(fromleft || remain%2==1) head+=steps;
        steps*=2;
        remain/=2;
        fromleft=!fromleft;
       }

   return head; }
}

// EX -> 123456  -> head = 1 , steps =1 , remain = 6
// we start from left so we have to update head
// new head = 1 + step = 2
// remain = 2,4,6 -> steps = 2 and remain = 3 
// see there are odd numbers so we have to again update head while coming from right
// ans is 4 which is our head as we check remain%2==1 : head = 2 + step(2)