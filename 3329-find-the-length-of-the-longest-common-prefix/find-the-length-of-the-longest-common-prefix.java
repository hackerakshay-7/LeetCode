class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for(int a : arr1){
            String temp ="";
            String s = String.valueOf(a);
            for(char c : s.toCharArray()){
                temp+=c;
                set.add(temp);
            }
        }
        int ans =0;
        for(int a : arr2){
            String temp ="";
            String s = String.valueOf(a);
            for(char c : s.toCharArray()){
                temp+=c;
                if(set.contains(temp)) ans=Math.max(ans,temp.length());
                else{break;}
            }
        }
   return ans; }
}
/*
 int len(String a , String b){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i< Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)) return sb.length();
            sb.append(a.charAt(i));
        }
        return sb.length();
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
     int ans =0;
     for(int i=0;i<arr1.length;i++){
        String a = arr1[i]+"";
        for(int j =0;j<arr2.length;j++){
            String b = arr2[j]+"";
            ans=Math.max(len(a,b),ans);
        }
     }   
    return ans;}*/