class Solution {
    public int minSwaps(String s) {
        int zero = 0,evenone = 0;
        int one = 0,oddone = 0;
        for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i)- '0' == 0)
                zero++;
            else {
                one++;
            }
           // if ((i & 1)== 0 && s.charAt(i) - '0' == 0)
            //  evenzero++;
            if ((i & 1) == 0 && s.charAt(i) - '0' == 1)
                evenone++;
            else if ((i & 1) == 1 && s.charAt(i) - '0' == 1)
                oddone++;
           // else if ((i & 1) == 1 && s.charAt(i) - '0' == 0)
             //   oddzero++;

        }
          if (Math.abs(zero- one)> 1)
            return -1;
            if(one > zero) return oddone;
            if(zero>one) return evenone;
        return Math.min(oddone,evenone);
    }
}