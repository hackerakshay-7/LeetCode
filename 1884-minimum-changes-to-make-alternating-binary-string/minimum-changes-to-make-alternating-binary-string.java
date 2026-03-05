class Solution {
    public int minOperations(String s) {
        //only two possible patterns either 101010 or 01010101
        // counting number of changes if ideal string = 010101--
        // length-count = no of changes req. to make 10101010-- 
        // returning minimum steps;
        int cunt =0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1') cunt++;
            }
            else{
                if(s.charAt(i)=='0') cunt++;
            }
        }
    return Math.min(cunt,s.length()-cunt);}
}