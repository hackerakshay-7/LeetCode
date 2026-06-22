class Solution {
    public int maxDistance(String moves) {
        int horizontal =0;
        int vertical =0,spacecount=0;
        for(char s : moves.toCharArray()){
            if( s=='R') horizontal++;
            if(s=='L') horizontal--;
            if(s=='U') vertical++;
            if(s=='D') vertical--;
            if(s=='_'){
               spacecount++;
            }
        }
        return Math.abs(horizontal)+Math.abs(vertical)+spacecount;
    }
}