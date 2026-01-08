class Solution { // lwda qsn
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return"";
       int j=0,count=0,mini=Integer.MAX_VALUE,r=0;
       HashMap<Character,Integer> map = new HashMap<>();
       for(int k =0;k<t.length();k++){
        map.put(t.charAt(k),map.getOrDefault(t.charAt(k),0)+1);}
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){  map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) count++;}
            
            while(count == map.size()){
                if(mini>i-j+1){ mini = i-j+1; r=j;}
                if(map.containsKey(s.charAt(j)))
{map.put(s.charAt(j),map.get(s.charAt(j))+1); 
 if(map.get(s.charAt(j))>0)count--;} j++;}
     }
    
  return mini>s.length() ? "": s.substring(r,mini+r); }
}