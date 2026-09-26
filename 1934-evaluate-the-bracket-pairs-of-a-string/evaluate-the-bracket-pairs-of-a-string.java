class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb =  new StringBuilder();
        int n = s.length();
        boolean consider = true;
        StringBuilder temp = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        for(List<String> a : knowledge){
            map.put(a.get(0),a.get(1));
        }
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('){
                consider=false;
            }
            else if(c==')'){ 
                if(map.containsKey(temp.toString())) sb.append(map.get(temp.toString()));
                else{ sb.append('?');}
                consider = true; temp.setLength(0);}
            else if(consider){ sb.append(c);}
            else{temp.append(c);}
           
        }
    return sb.toString();}
}