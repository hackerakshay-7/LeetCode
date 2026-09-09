class Solution {
    // consecutive three a count vs cons three b count 
    public boolean winnerOfGame(String s) {
        int A=0;
        int B=0;
        int alice =0;
        int bob = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='A'){A++; B=0;}
            if(s.charAt(i)=='B') {B++; A=0;}
            if(A>=3) alice++;
            if(B>=3) bob++;
        }


        return alice>bob;
    }
}