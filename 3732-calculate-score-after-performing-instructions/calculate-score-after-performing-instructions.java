class Solution {
    public long calculateScore(String[] s, int[] values) {
        int n = values.length;
        boolean isv[] = new boolean[n];
        int i =0;
        long score =0l;
        while(i<n && i>=0 && isv[i]==false){
            isv[i]=true;
            if(s[i].equals("jump")){
                i+=values[i];}
            else if(s[i].equals("add")){
                score+=values[i];
                i++;}
        }
        return score;
    }
}