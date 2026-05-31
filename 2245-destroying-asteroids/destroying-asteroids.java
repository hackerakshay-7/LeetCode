class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mas=mass;
        for(int a : asteroids){
            if(a>mas) return false;
            mas+=a;
        }
   return true; }
}