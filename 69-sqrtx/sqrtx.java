class Solution {
    public int mySqrt(int x) {
        int f=0,e=x;
        while(f<=e){
             int mid = f +(e-f)/2;
             long sqr=(long)mid*mid;
            if(sqr==x) return mid;
           else if(sqr>x){ e=mid-1;}
           else{ f=mid+1;}
        }
  return e;  }
}