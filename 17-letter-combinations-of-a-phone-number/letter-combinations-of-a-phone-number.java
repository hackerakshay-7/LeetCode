class Solution {
    void backtrack(String s,List<String> ans , String digits , int i , HashMap<Character,String> map ){
        if(i==digits.length()) {ans.add(s); return;}
        for(int j=0;j<map.get(digits.charAt(i)).length();j++){
            backtrack(s+map.get(digits.charAt(i)).charAt(j),ans,digits,i+1,map);
        }


    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
       backtrack("",ans,digits,0,map);
    return ans;}
}