class Solution {
    // Integer dp[][];
    // private int rec(String s , int i){

    // }
    public int scoreOfParentheses(String s) {
        int count =0;
        int nesting =0;
        char prev=' ';
        for(char a : s.toCharArray()){
            if(a=='('){ nesting++;}
            else if( a==')' && nesting>0){
                if(prev=='(' ){
                    count+=(int)Math.pow(2,(nesting-1));
                }
                 nesting--;
            }
            prev=a;
        }
    return count;}
}