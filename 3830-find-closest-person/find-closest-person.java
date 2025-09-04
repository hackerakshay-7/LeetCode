class Solution {
    public int findClosest(int x, int y, int z) {
//         if(z>x && z>y){x>y?return 1:return 2;}
//  else if(z)
int a= Math.abs(z-x),b=Math.abs(z-y);
if(a==b) return 0;
if(a<b) return 1;
   return 2; }
}