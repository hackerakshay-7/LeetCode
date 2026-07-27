class Solution {
    public int minLengthAfterRemovals(String s) {
        int acount =0;
        int bcount=0;
        for(char a : s.toCharArray()){
            if(a=='a') acount++;
            if(a=='b') bcount++;
        }
        return Math.abs(acount-bcount);
    }
}