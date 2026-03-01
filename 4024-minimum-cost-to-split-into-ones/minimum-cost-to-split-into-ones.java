class Solution {
    public int minCost(int n) {
        int count=1,ans=0;
        if(n==1) return 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
            if(n%2==0){
                pq.add(n/2);
                pq.add(n/2);
                ans+=((n/2)*(n/2));
            }
            else{pq.add((n/2)+1);pq.add(n/2);ans+=((n/2)*((n/2)+1));}
            count++;
            while(count!=n){
                int p = pq.poll();
                if(p==1) continue;
                if(p%2==0){ pq.add(p/2);pq.add(p/2); 
                 ans+=((p/2)*(p/2));}
                else{pq.add((p/2)+1);pq.add(p/2);
                ans+=((p/2)*((p/2)+1));}
                count++;
            }
   return ans; }
}