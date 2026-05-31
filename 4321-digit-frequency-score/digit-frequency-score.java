class Solution {
    public int digitFrequencyScore(int n) {
        int digisum = 0;
       int [] arr = new int[10];
        while (n > 0) {
            int temp = n % 10;
           arr[temp]++;
            n /= 10;
        }
       for(int i =0;i<10;i++){
        digisum+=(i*arr[i]);
       }
        return digisum;
    }
}