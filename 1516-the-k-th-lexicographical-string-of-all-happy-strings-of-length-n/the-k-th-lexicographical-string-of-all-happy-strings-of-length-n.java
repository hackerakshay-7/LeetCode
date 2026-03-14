class Solution {
    void fun(ArrayList<StringBuilder> list , int n , StringBuilder sb){
        if(sb.length()==n) {
        list.add(new StringBuilder(sb));
        return;}
        char e [] = {'a','b','c'};
        for(char d : e){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==d) continue;
            sb.append(d);
            fun(list,n,sb);
            sb.deleteCharAt(sb.length()-1); 
        }
      
    }
    public String getHappyString(int n, int k) {
       ArrayList<StringBuilder> list = new ArrayList<>();
       fun(list,n, new StringBuilder());
      
       return k>list.size()?"":list.get(k-1).toString();
      
    }
}