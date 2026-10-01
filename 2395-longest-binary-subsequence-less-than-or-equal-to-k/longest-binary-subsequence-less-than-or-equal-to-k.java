class Solution {
    public int longestSubsequence(String s, int k) {
        // kitne one lena hai bas wahi dkhna hai without changing pos
        int count = 0;
        int pos = 0;
        long sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0'){
                count++; pos++;}
            else {
                int b = (int) Math.pow(2, pos);
                if (sum + (b) <= k) {
                    sum += b;
                    count++;
                    pos++;
                }
            }
            
        }
        return count;
    }
}

/**
 String a = Integer.toBinaryString(k);
        int l = a.length();
        if(l>=s.length()) return s.length();
       int zerocount = 0;
       for(int i =0;i<s.length()-l;i++){
          if( s.charAt(i)=='0') zerocount++;
       }
       return zerocount+l; */