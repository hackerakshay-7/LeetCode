class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
      int r1x1=r1[0],
          r1y1=r1[1],
          r1x2=r1[2],
          r1y2=r1[3];

      int r2x1=r2[0],
          r2y1=r2[1],
          r2x2=r2[2],
          r2y2=r2[3];
        
        // intersection kab kab nahi kar skta ->
        if(r2x1>=r1x2) return false;
        if(r2y1>=r1y2) return false;
        if(r2x2<=r1x1) return false;
        if(r2y2<=r1y1) return false;
        return true;
    }
}