class Solution {
    public boolean stoneGameIX(int[] stones) {
       int modone =0;
       int modtwo = 0;
        for(int a : stones){
            if(a%3==1) modone++;
            else if(a%3==2) modtwo++;
        }
        if(modone ==0 && modtwo==0) return false;
        int modzero = stones.length-modone-modtwo;
        // boolean turn = true;
        // int last = 1;
        // -------] only two mod patterns -> 112121212~ || 22121212121212~
        // this return statement was a boon by gpt
        if(modzero%2==0) return modone>0 && modtwo>0;
        return Math.abs(modone-modtwo)>2;
        
    }
}