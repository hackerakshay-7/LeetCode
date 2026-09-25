class Solution {
    // mandarin // bow 
    public List<String> braceExpansionII(String exp) {
        HashSet<String> set = new HashSet<>();
        Queue<String> q = new ArrayDeque<>();
        q.offer(exp);
        while(!q.isEmpty()){
            String temp = q.poll();
            int left = temp.indexOf('{');
            if(left==-1) {set.add(temp); continue;}
            int right = left;
            while(right<temp.length() && temp.charAt(right)!='}'){
                //
                if(temp.charAt(right)=='{'){ left = right;}
                right++;
            }
            String done = temp.substring(0,left);
            String doing [] = temp.substring(left+1,right).split(",");
            String haveto = temp.substring(right+1);

            for(String a : doing){
                StringBuilder shit = new StringBuilder(done);
                shit.append(a).append(haveto);
                q.offer(shit.toString());
            }
        }
        ArrayList<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;

    }
}