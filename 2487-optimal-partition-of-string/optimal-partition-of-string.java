class Solution {
    public int partitionString(String s) {
        int count=1;//sount=1;
        HashSet<Character> map = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.contains(s.charAt(i))){
            map.clear(); count++;}
           map.add(s.charAt(i));}
           // map.clear();
        // for(int i =s.length()-1;i>=0;i--){
        //      if(map.contains(s.charAt(i))){
        //     map.clear(); sount++;}
        //    map.add(s.charAt(i));
        // }
   return count; }
}