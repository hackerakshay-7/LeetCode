class Solution {
    private void back(int n, List<String> ans, String temp,int sum,int k) {
        if(sum>k) return;
        if (temp.length() == n) {
            if(sum<=k) ans.add(temp);
            return;
        }
        back(n, ans, temp + '0',sum,k);
        if(temp.isEmpty() || temp.charAt(temp.length()-1)!='1'){
        back(n, ans, temp + '1',sum+temp.length(),k);}
    }

    public List<String> generateValidStrings(int n, int k) {
        ArrayList<String> temp = new ArrayList<>();
        back(n, temp,"",0,k);
    return temp;}
}