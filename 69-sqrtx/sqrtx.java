class Solution {
    public int mySqrt(float x,float m, float step){
        float square =m*m;
        if(square== x) return (int)m;
        if(square>x){
            if(step>0.01){return mySqrt(x,m-step,step/10);}
            else{ return (int)(m-step);}
        }
        else{return mySqrt(x,m+step,step);}
    }
    public int mySqrt(int x) {
      int o=mySqrt(x,0,1);
       if(o*o>x) return o-1;
       return o;
       }
}