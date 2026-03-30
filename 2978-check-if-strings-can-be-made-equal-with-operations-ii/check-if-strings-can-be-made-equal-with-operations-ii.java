class Solution {
    public boolean checkStrings(String s1, String s2) {
        int evens1 [] = new int[26];
        int evens2 []= new int [26];
        int odds1 [] = new int[26];
        int odds2 [] = new int [26];  
        for(int i =0;i<s1.length();i++){
            if(i%2==0){
                evens1[s1.charAt(i)-97]++;
                evens2[s2.charAt(i)-97]++;
                
            }
            else{
                odds1[s1.charAt(i)-97]++;
                odds2[s2.charAt(i)-97]++;
            }
        }
        for(int i = 0;i<26;i++){
            if(evens1[i]!=evens2[i]) return false;
            if(odds1[i]!=odds2[i]) return false;
        }
        

    return true;}
}