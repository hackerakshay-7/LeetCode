class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int ans=0,sum=0,sum2=0;
        for(int num : apple){sum+=num;}
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>-1;i--){
            if(sum2>=sum) return ans;
            sum2+=capacity[i]; ans++;
        }
    return ans;}
}