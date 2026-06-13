class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder(words.length);
        for(String a : words){
            int sum =0;
            for(int j =0;j<a.length();j++){
                sum+=(weights[a.charAt(j)-'a']);
            }
            sum=sum%26;
            sb.append((char)(97+25-sum));
        }
   return sb.toString(); }
}