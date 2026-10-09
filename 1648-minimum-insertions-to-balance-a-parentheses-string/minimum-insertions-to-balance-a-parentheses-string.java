class Solution {
    // ek opening ke liye 2 closing regularly
    // count imbalance only
    public int minInsertions(String s) {
      int n =s.length();
      int open =0;
      int i =0;
      int result =0;
    while(i<n){
        char c = s.charAt(i);
        if(c=='(') {open++;i++;}
        else{ //')'
            if(open>0) open--;
            else{
                result++; //insert an open
            }
            if(i<n-1 && s.charAt(i+1)==')') i+=2;
            else{ result++;
            i++; // insert a close
            }

        }
    }
      return open==0?result:(result+(2*open)); }
}

/**
 int open=0,
            close=0;
        for(char c : s.toCharArray()){
            if(c=='(') open++;
            else{
                close++;
            }
        }
        if(open==close) return open;
        else if(open==2*close){ return 0;}
        else if(open>close){return (open-close)*2+open;}
        else if(close>open){
            if(close/2>open){
                // more num of closing bracks
                if(close%2==0){
                    // only need opening bracks
                    return (close-(open*2))/2; // each closing pair recieves one open
                }
                else{
                    // one closing and opening only
                    return ((close-(open*2))/2 +1);
                }
            }
            else{
                // need closing only
                return (open*2-close);
            }
        }
   return 0;  */

   /**
    int closeneed=0;
       for(char c : s.toCharArray()){
            if(c=='('){closeneed+=2; openneed-=1;}
            else{ openneed+=0.5;closeneed-=1;}
       }

      return Math.abs(openneed)+Math.abs(closeneed);  */