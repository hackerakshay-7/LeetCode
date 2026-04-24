class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left =0;
        int right =0;
        for(char a : moves.toCharArray()){
            if( a=='L') left++;
            if(a=='R') right++;
        }
        int anywhere = moves.length()-left-right;
        return Math.max(left,right)+anywhere-Math.min(left,right);
    }
}