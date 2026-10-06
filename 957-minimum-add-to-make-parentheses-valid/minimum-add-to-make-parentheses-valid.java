class Solution {
    public int minAddToMakeValid(String s) {
        int open =0,
            count=0,
            close=0;
        for(char a: s.toCharArray()){
            if(a=='('){open++;}
            else{
                if(open>0){ open--;}
                else{count++;}
            }
        }
    return count+open;}
}