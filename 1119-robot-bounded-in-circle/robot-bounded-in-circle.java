class Solution {
    public boolean isRobotBounded(String instructions) {
        // pretty tricky 
        // amazon and goldman sacchs 
        int x=0,y=0;
        int dirx=0,diry=1;
         // direction vector -> 
         //N ->{0,1} , S->{0,-1} , E -> {1,0} , W ->{-1,0};
        //DIRY-> if facing up then +1 if down then -1 nd if not in y dir. then 0
        for(char a : instructions.toCharArray()){
            if(a=='G'){ x+=dirx;y+=diry;}
            else if ( a=='L'){
                // TOGGLE TO SHIFT 90DEG
                int temp = dirx;
                dirx=-1*diry;
                diry = temp;
            }
            else{
                // right
                int temp = diry;
                diry=-1*dirx;
                dirx=temp;
            }
        }
        // just need to check a single iteration
        // if dirction didnt change then it becomes impossible
        // if we reacch origin then viola!
        // if direction changes then one day all will cancel out and result cycle
   return (!(dirx==0 && diry==1)|| (x==0 && y==0)); }
}