class Solution {
    public String[] findRelativeRanks(int[] score) {
    PriorityQueue <Integer> pq= 
                         new PriorityQueue<>(Collections.reverseOrder()); 
    for(int a : score) pq.offer(a);
    HashMap<Integer,Integer> map = new HashMap<>();
    int rank =1;
    while(!pq.isEmpty()){
        map.put(pq.poll(),rank);
        rank++;
    }
    String ans [] = new String[score.length];
    for(int i =0;i<score.length;i++){
        int a = map.get(score[i]);
        if(a==1) ans[i]="Gold Medal";
        else if(a==2) ans[i] = "Silver Medal";
       else if(a==3) ans[i] = "Bronze Medal";
        else{ ans[i] = a +"";}
    }

   return ans; }
}