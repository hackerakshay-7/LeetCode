class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs((double)(30*hour)-(double)((double)5.5*(double)minutes));
        double angle2 = (double)Math.abs(360-angle);
   return Math.min(angle,angle2); }
}