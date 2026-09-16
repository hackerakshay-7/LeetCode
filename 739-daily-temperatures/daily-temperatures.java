class Solution {
    // class Pair{
    //     int idx;
    //     int temp;
    //     Pair(int temp,int idx){ this.idx=idx;this.temp=temp;}
    // } //    NGL NGE
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int n = t.length;
        int ans [] = new int [n];
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && t[st.peek()]<=t[i]){ st.pop();}
            if(!st.isEmpty()) ans[i]=st.peek()-i;
            st.push(i);
           
        }
   return ans; }
}