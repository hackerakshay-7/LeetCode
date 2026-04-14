class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod=1000_000_007;
        String s = Integer.toBinaryString(n);
       ArrayList<Integer> pow = new ArrayList<>();
       long multi = 1;
       for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                pow.add((int)(multi%mod));
            }
            multi=(multi*2)%mod; }
            int [] ans = new int[queries.length];
        for(int i =0;i<queries.length;i++ ){
            long temp=1;
            int l = queries[i][0];
            int r = queries[i][1];
            while(l<=r){
                temp=(temp*pow.get(l))%mod;
                l++;
            }
            ans[i]=(int)(temp%mod);
        }
        


    return ans;}
}