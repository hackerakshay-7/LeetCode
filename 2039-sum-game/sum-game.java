class Solution {
    public boolean sumGame(String num) {
       int  qcount = 0,sum1=0;
         int q2count =0,sum2=0;
        for(int i =0;i<num.length();i++){
            if(i<num.length()/2){
                if(num.charAt(i)=='?') qcount++;
                else{sum1+=(num.charAt(i)-'0');}
            }
            else{
                 if(num.charAt(i)=='?') q2count++;
                 else{sum2+=(num.charAt(i)-'0');}
            }
        }
        //    if(sum1==sum2 && qcount==0 && q2count==0) return false;
           int diff = sum1-sum2;

   return 2*diff!=9*(q2count-qcount); }
}