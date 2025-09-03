class Solution {
    public int maxNumberOfBalloons(String text) {
        String b ="balloon";
        int [] arr=new int[26],arr2=new int[26];
        for( char ch : text.toCharArray()){
            arr[ch-'a']++;}
        for(char ch : b.toCharArray()){
            arr2[ch-'a']++;}
            int min=Integer.MAX_VALUE;
            for(int i=0;i<26;i++){
                if(arr2[i]!=0){ min = Math.min(min,arr[i]/arr2[i]);}
            }

   return min; }
}