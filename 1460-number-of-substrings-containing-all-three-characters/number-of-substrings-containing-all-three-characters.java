class Solution {
    public int numberOfSubstrings(String s) {
        // sliding window for optimization;
        int count =0;
      int last []= {-1,-1,-1};
      for(int i=0;i<s.length();i++){
        last[s.charAt(i)-'a'] = i;
        if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1){
            count+=(1+Math.min(Math.min(last[0],last[1]),last[2]));
        }
      }
    return count;}
}
/**
  HashSet<Character> set = new HashSet<>();
        int count = 0,i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length()){
                set.add(s.charAt(j));
                if(set.size()==3){
                    set.remove(s.charAt(i));
                    count= count+(s.length()-j);
                    break;
                }
                j++;
            }
            i++;
        }
        return count; */