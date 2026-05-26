class Solution {
    public int numberOfSpecialChars(String word) {
     HashSet<Character> set = new HashSet<>();
     int count =0;
     for(char c : word.toCharArray()){
        set.add(c);
     } 
     for(char c : word.toCharArray()){
        if(set.contains((char)(c+32))){
            count++;
            set.remove(c);
            set.remove((char)(c+32));
        }
     }
   return count; }
}